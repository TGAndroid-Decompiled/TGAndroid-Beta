package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.stripe.android.Stripe;
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

public final class AvatarsListDrawable extends Drawable {
    public boolean attached;
    public final int avatarOffset;
    public final int avatarSize;
    public final float avatarStroke;
    public final int currentAccount;
    public final ViewGroup parent;
    public final ListAnimator animator = new ListAnimator(new Stripe.AnonymousClass1(this, 23), CubicBezierInterpolator.EASE_OUT_QUINT, 380);
    public final ArrayList avatarItemsPool = new ArrayList();
    public int alpha = 255;

    public final class AvatarItem implements ListAnimator.Measurable, Destroyable {
        public boolean attached;
        public final AvatarDrawable avatarDrawable;
        public long dialogId;
        public final ImageReceiver imageReceiver;

        public AvatarItem(ViewGroup viewGroup) {
            ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
            this.imageReceiver = imageReceiver;
            imageReceiver.setRoundRadius(AvatarsListDrawable.this.avatarSize / 2);
            AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            this.avatarDrawable = avatarDrawable;
            avatarDrawable.namePaint.setTextSize(AndroidUtilities.dp(22.0f));
        }

        public final boolean equals(Object obj) {
            return (obj instanceof AvatarItem) && this.dialogId == ((AvatarItem) obj).dialogId;
        }

        @Override
        public final int getHeight() {
            return AvatarsListDrawable.this.avatarSize;
        }

        @Override
        public final int getSpacingStart(boolean z) {
            if (z) {
                return 0;
            }
            return -AvatarsListDrawable.this.avatarOffset;
        }

        @Override
        public final int getWidth() {
            return AvatarsListDrawable.this.avatarSize;
        }

        @Override
        public final void performDestroy() {
            if (this.attached) {
                this.attached = false;
                this.imageReceiver.onDetachedFromWindow();
            }
            this.dialogId = 0L;
        }
    }

    public AvatarsListDrawable(int i, ViewGroup viewGroup, int i2, int i3, float f) {
        this.currentAccount = i;
        this.parent = viewGroup;
        this.avatarSize = i2;
        this.avatarOffset = i3;
        this.avatarStroke = f;
    }

    public final void attach() {
        if (this.attached) {
            return;
        }
        this.attached = true;
        ArrayList arrayList = this.avatarItemsPool;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            AvatarItem avatarItem = (AvatarItem) obj;
            if (avatarItem.dialogId != 0 && !avatarItem.attached) {
                avatarItem.attached = true;
                avatarItem.imageReceiver.onAttachedToWindow();
            }
        }
    }

    public final void detach() {
        if (this.attached) {
            this.attached = false;
            ArrayList arrayList = this.avatarItemsPool;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                AvatarItem avatarItem = (AvatarItem) obj;
                if (avatarItem.attached) {
                    avatarItem.attached = false;
                    avatarItem.imageReceiver.onDetachedFromWindow();
                }
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        draw$1(canvas);
    }

    public final void draw$1(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.alpha == 0) {
            return;
        }
        float f = bounds.left;
        float f2 = bounds.top;
        ListAnimator listAnimator = this.animator;
        canvas.saveLayer(f, f2, f + listAnimator.metadata.totalWidth.now, f2 + this.avatarSize, null);
        for (int size = listAnimator.entries.size() - 1; size >= 0; size--) {
            ListAnimator.Entry entry = (ListAnimator.Entry) listAnimator.entries.get(size);
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

    @Override
    public final int getAlpha() {
        return this.alpha;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final void set(List list, boolean z) {
        AvatarItem avatarItem;
        ListAnimator listAnimator = this.animator;
        if (list == null || list.isEmpty()) {
            listAnimator.reset(null, z);
            return;
        }
        if (!z) {
            listAnimator.reset(null, false);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) it.next());
            ArrayList arrayList2 = this.avatarItemsPool;
            int size = arrayList2.size();
            int i = 0;
            do {
                if (i >= size) {
                    avatarItem = null;
                    break;
                } else {
                    Object obj = arrayList2.get(i);
                    i++;
                    avatarItem = (AvatarItem) obj;
                }
            } while (avatarItem.dialogId != peerDialogId);
            if (avatarItem == null) {
                int size2 = arrayList2.size();
                int i2 = 0;
                do {
                    if (i2 >= size2) {
                        avatarItem = null;
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        avatarItem = (AvatarItem) obj2;
                    }
                } while (avatarItem.dialogId != 0);
            }
            if (avatarItem == null) {
                avatarItem = new AvatarItem(this.parent);
                arrayList2.add(avatarItem);
            }
            AvatarItem avatarItem2 = avatarItem;
            long j = avatarItem2.dialogId;
            ImageReceiver imageReceiver = avatarItem2.imageReceiver;
            if (j != peerDialogId) {
                avatarItem2.dialogId = peerDialogId;
                int i3 = this.currentAccount;
                TLObject userOrChat = MessagesController.getInstance(i3).getUserOrChat(peerDialogId);
                AvatarDrawable avatarDrawable = avatarItem2.avatarDrawable;
                if (userOrChat != null) {
                    avatarDrawable.setInfo(i3, userOrChat);
                    imageReceiver.setForUserOrChat(userOrChat, avatarDrawable);
                } else {
                    avatarDrawable.setInfo(peerDialogId, "", "", null, null);
                    imageReceiver.clearImage();
                }
            }
            arrayList.add(avatarItem2);
            if (this.attached && !avatarItem2.attached) {
                avatarItem2.attached = true;
                imageReceiver.onAttachedToWindow();
            }
        }
        listAnimator.reset(arrayList, z);
    }

    @Override
    public final void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
