package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.core.lambda.Destroyable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public class AvatarsListDrawable extends Drawable {
    private boolean attached;
    private final int avatarOffset;
    private final int avatarSize;
    private final float avatarStroke;
    private final int currentAccount;
    private final View parent;
    private final ListAnimator animator = new ListAnimator(new ListAnimator.Callback() {
        @Override
        public boolean hasChanges(ListAnimator listAnimator) {
            return false;
        }

        @Override
        public boolean onApplyMetadataAnimation(ListAnimator listAnimator, float f) {
            return false;
        }

        @Override
        public void onFinishMetadataAnimation(ListAnimator listAnimator, boolean z) {
        }

        @Override
        public void onForceApplyChanges(ListAnimator listAnimator) {
        }

        @Override
        public void onItemsChanged(ListAnimator listAnimator) {
            AvatarsListDrawable.this.parent.invalidate();
        }

        @Override
        public void onPrepareMetadataAnimation(ListAnimator listAnimator) {
        }
    }, CubicBezierInterpolator.EASE_OUT_QUINT, 380);
    private final ArrayList<AvatarItem> avatarItemsPool = new ArrayList<>();
    private int alpha = 255;

    public class AvatarItem implements ListAnimator.Measurable, Destroyable {
        private boolean attached;
        private final AvatarDrawable avatarDrawable;
        private long dialogId;
        private final ImageReceiver imageReceiver;

        public void attach() {
            if (this.attached) {
                return;
            }
            this.attached = true;
            this.imageReceiver.onAttachedToWindow();
        }

        public void detach() {
            if (this.attached) {
                this.attached = false;
                this.imageReceiver.onDetachedFromWindow();
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof AvatarItem) && this.dialogId == ((AvatarItem) obj).dialogId;
        }

        @Override
        public int getHeight() {
            return AvatarsListDrawable.this.avatarSize;
        }

        @Override
        public int getSpacingEnd(boolean z) {
            return 0;
        }

        @Override
        public int getSpacingStart(boolean z) {
            if (z) {
                return 0;
            }
            return -AvatarsListDrawable.this.avatarOffset;
        }

        @Override
        public int getWidth() {
            return AvatarsListDrawable.this.avatarSize;
        }

        @Override
        public void performDestroy() {
            detach();
            this.dialogId = 0L;
        }

        public void set(int i, long j) {
            if (this.dialogId == j) {
                return;
            }
            this.dialogId = j;
            TLObject userOrChat = MessagesController.getInstance(i).getUserOrChat(j);
            if (userOrChat != null) {
                this.avatarDrawable.setInfo(i, userOrChat);
                this.imageReceiver.setForUserOrChat(userOrChat, this.avatarDrawable);
            } else {
                this.avatarDrawable.setInfo(j, "", "");
                this.imageReceiver.clearImage();
            }
        }

        private AvatarItem(View view) {
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.imageReceiver = imageReceiver;
            imageReceiver.setRoundRadius(AvatarsListDrawable.this.avatarSize / 2);
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            this.avatarDrawable = avatarDrawable;
            avatarDrawable.setTextSize(AndroidUtilities.dp(22.0f));
        }
    }

    public AvatarsListDrawable(int i, View view, int i2, int i3, float f) {
        this.currentAccount = i;
        this.parent = view;
        this.avatarSize = i2;
        this.avatarOffset = i3;
        this.avatarStroke = f;
    }

    private AvatarItem find(long j) {
        ArrayList<AvatarItem> arrayList = this.avatarItemsPool;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            AvatarItem avatarItem = arrayList.get(i);
            i++;
            AvatarItem avatarItem2 = avatarItem;
            if (avatarItem2.dialogId == j) {
                return avatarItem2;
            }
        }
        return null;
    }

    public void attach() {
        if (this.attached) {
            return;
        }
        this.attached = true;
        ArrayList<AvatarItem> arrayList = this.avatarItemsPool;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            AvatarItem avatarItem = arrayList.get(i);
            i++;
            AvatarItem avatarItem2 = avatarItem;
            if (avatarItem2.dialogId != 0) {
                avatarItem2.attach();
            }
        }
    }

    public void detach() {
        if (this.attached) {
            int i = 0;
            this.attached = false;
            ArrayList<AvatarItem> arrayList = this.avatarItemsPool;
            int size = arrayList.size();
            while (i < size) {
                AvatarItem avatarItem = arrayList.get(i);
                i++;
                avatarItem.detach();
            }
        }
    }

    @Override
    public void draw(Canvas canvas) {
        draw(canvas, null);
    }

    @Override
    public int getAlpha() {
        return this.alpha;
    }

    public float getAnimatedWidth() {
        return this.animator.metadata.totalWidth.now;
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    public float getTotalVisibility() {
        return this.animator.metadata.totalVisibility.now;
    }

    public void set(List<TLRPC.Peer> list, boolean z) {
        if (list == null || list.isEmpty()) {
            this.animator.reset(null, z);
            return;
        }
        if (!z) {
            this.animator.reset(null, false);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<TLRPC.Peer> it = list.iterator();
        while (it.hasNext()) {
            long peerDialogId = DialogObject.getPeerDialogId(it.next());
            AvatarItem avatarItemFind = find(peerDialogId);
            if (avatarItemFind == null) {
                avatarItemFind = find(0L);
            }
            if (avatarItemFind == null) {
                avatarItemFind = new AvatarItem(this.parent);
                this.avatarItemsPool.add(avatarItemFind);
            }
            avatarItemFind.set(this.currentAccount, peerDialogId);
            arrayList.add(avatarItemFind);
            if (this.attached) {
                avatarItemFind.attach();
            }
        }
        this.animator.reset(arrayList, z);
    }

    @Override
    public void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void draw(Canvas canvas, Paint paint) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.alpha == 0) {
            return;
        }
        float f = bounds.left;
        float f2 = bounds.top;
        canvas.saveLayer(f, f2, f + this.animator.metadata.totalWidth.now, f2 + this.avatarSize, null);
        for (int size = this.animator.entries.size() - 1; size >= 0; size--) {
            ListAnimator.Entry entry = (ListAnimator.Entry) this.animator.entries.get(size);
            RectF rectF = entry.getRectF();
            float f3 = entry.measuredSpacingStart.now;
            float visibility = entry.getVisibility();
            float f4 = rectF.left + f3;
            float fWidth = rectF.width() - f3;
            float f5 = f + f4;
            float f6 = fWidth / 2.0f;
            float f7 = f5 + f6;
            float f8 = f2 + f6;
            canvas.save();
            canvas.scale(visibility, visibility, f7, f8);
            canvas.drawCircle(f7, f8, f6 + this.avatarStroke, Theme.PAINT_CLEAR);
            Object obj = entry.item;
            ((AvatarItem) obj).imageReceiver.setImageCoords(f5, f2, fWidth, fWidth);
            ((AvatarItem) obj).imageReceiver.setAlpha((this.alpha / 255.0f) * entry.getVisibility());
            ((AvatarItem) obj).imageReceiver.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }
}
