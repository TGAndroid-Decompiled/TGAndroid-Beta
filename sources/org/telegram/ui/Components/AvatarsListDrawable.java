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
            return ListAnimator.MetadataCallback.CC.$default$hasChanges(this, listAnimator);
        }

        @Override
        public boolean onApplyMetadataAnimation(ListAnimator listAnimator, float f) {
            return ListAnimator.MetadataCallback.CC.$default$onApplyMetadataAnimation(this, listAnimator, f);
        }

        @Override
        public void onFinishMetadataAnimation(ListAnimator listAnimator, boolean z) {
            ListAnimator.MetadataCallback.CC.$default$onFinishMetadataAnimation(this, listAnimator, z);
        }

        @Override
        public void onForceApplyChanges(ListAnimator listAnimator) {
            ListAnimator.MetadataCallback.CC.$default$onForceApplyChanges(this, listAnimator);
        }

        @Override
        public void onPrepareMetadataAnimation(ListAnimator listAnimator) {
            ListAnimator.MetadataCallback.CC.$default$onPrepareMetadataAnimation(this, listAnimator);
        }

        @Override
        public void onItemsChanged(ListAnimator listAnimator) {
            AvatarsListDrawable.this.parent.invalidate();
        }
    }, CubicBezierInterpolator.EASE_OUT_QUINT, 380);
    private final ArrayList avatarItemsPool = new ArrayList();
    private int alpha = 255;

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public AvatarsListDrawable(int i, View view, int i2, int i3, float f) {
        this.currentAccount = i;
        this.parent = view;
        this.avatarSize = i2;
        this.avatarOffset = i3;
        this.avatarStroke = f;
    }

    public void set(List list, boolean z) {
        if (list == null || list.isEmpty()) {
            this.animator.clear(z);
            return;
        }
        if (!z) {
            this.animator.clear(false);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) it.next());
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

    public void attach() {
        if (this.attached) {
            return;
        }
        this.attached = true;
        for (AvatarItem avatarItem : this.avatarItemsPool) {
            if (avatarItem.dialogId != 0) {
                avatarItem.attach();
            }
        }
    }

    public void detach() {
        if (this.attached) {
            this.attached = false;
            Iterator it = this.avatarItemsPool.iterator();
            while (it.hasNext()) {
                ((AvatarItem) it.next()).detach();
            }
        }
    }

    private AvatarItem find(long j) {
        for (AvatarItem avatarItem : this.avatarItemsPool) {
            if (avatarItem.dialogId == j) {
                return avatarItem;
            }
        }
        return null;
    }

    private class AvatarItem implements ListAnimator.Measurable, Destroyable {
        private boolean attached;
        private final AvatarDrawable avatarDrawable;
        private long dialogId;
        private final ImageReceiver imageReceiver;

        @Override
        public int getSpacingEnd(boolean z) {
            return ListAnimator.Measurable.CC.$default$getSpacingEnd(this, z);
        }

        private AvatarItem(View view) {
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.imageReceiver = imageReceiver;
            imageReceiver.setRoundRadius(AvatarsListDrawable.this.avatarSize / 2);
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            this.avatarDrawable = avatarDrawable;
            avatarDrawable.setTextSize(AndroidUtilities.dp(22.0f));
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
        public void performDestroy() {
            detach();
            this.dialogId = 0L;
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
        public int getHeight() {
            return AvatarsListDrawable.this.avatarSize;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        draw(canvas, null);
    }

    public void draw(Canvas canvas, Paint paint) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.alpha == 0) {
            return;
        }
        float f = bounds.left;
        float f2 = bounds.top;
        canvas.saveLayer(f, f2, f + this.animator.getMetadata().getTotalWidth(), f2 + this.avatarSize, null);
        for (int size = this.animator.size() - 1; size >= 0; size--) {
            ListAnimator.Entry entry = this.animator.getEntry(size);
            RectF rectF = entry.getRectF();
            float spacingStart = entry.getSpacingStart();
            float visibility = entry.getVisibility();
            float f3 = rectF.left + spacingStart;
            float fWidth = rectF.width() - spacingStart;
            float f4 = f3 + f;
            float f5 = fWidth / 2.0f;
            float f6 = f4 + f5;
            float f7 = f2 + f5;
            canvas.save();
            canvas.scale(visibility, visibility, f6, f7);
            canvas.drawCircle(f6, f7, f5 + this.avatarStroke, Theme.PAINT_CLEAR);
            ((AvatarItem) entry.item).imageReceiver.setImageCoords(f4, f2, fWidth, fWidth);
            ((AvatarItem) entry.item).imageReceiver.setAlpha(entry.getVisibility() * (this.alpha / 255.0f));
            ((AvatarItem) entry.item).imageReceiver.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public float getAnimatedWidth() {
        return this.animator.getMetadata().getTotalWidth();
    }

    public float getTotalVisibility() {
        return this.animator.getMetadata().getTotalVisibility();
    }

    @Override
    public void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public int getAlpha() {
        return this.alpha;
    }
}
