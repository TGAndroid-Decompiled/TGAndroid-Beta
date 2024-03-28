package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.Components.AvatarDrawable;
public class AvatarSpan extends ReplacementSpan {
    private final AvatarDrawable avatarDrawable;
    private final int currentAccount;
    private final ImageReceiver imageReceiver;
    private View parent;
    private final View.OnAttachStateChangeListener parentAttachListener = new View.OnAttachStateChangeListener() {
        @Override
        public void onViewAttachedToWindow(View view) {
            AvatarSpan.this.imageReceiver.onAttachedToWindow();
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
            AvatarSpan.this.imageReceiver.onDetachedFromWindow();
        }
    };
    private final Paint shadowPaint;
    private final int sz;
    private float translateX;
    private float translateY;

    public AvatarSpan(View view, int i, int i2) {
        this.currentAccount = i;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.imageReceiver = imageReceiver;
        this.avatarDrawable = new AvatarDrawable();
        imageReceiver.setRoundRadius(AndroidUtilities.dp(i2));
        this.sz = i2;
        Paint paint = new Paint(1);
        this.shadowPaint = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), AndroidUtilities.DARK_STATUS_BAR_OVERLAY);
        setParent(view);
    }

    public void setParent(View view) {
        View view2 = this.parent;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this.parentAttachListener);
            if (this.parent.isAttachedToWindow() && !view.isAttachedToWindow()) {
                this.imageReceiver.onDetachedFromWindow();
            }
        }
        View view3 = this.parent;
        if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
            this.imageReceiver.onAttachedToWindow();
        }
        this.parent = view;
        this.imageReceiver.setParentView(view);
        if (view != null) {
            view.addOnAttachStateChangeListener(this.parentAttachListener);
        }
    }

    public static void checkSpansParent(CharSequence charSequence, View view) {
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (AvatarSpan avatarSpan : (AvatarSpan[]) spannable.getSpans(0, spannable.length(), AvatarSpan.class)) {
                avatarSpan.setParent(view);
            }
        }
    }

    public void setChat(TLRPC$Chat tLRPC$Chat) {
        this.avatarDrawable.setInfo(this.currentAccount, tLRPC$Chat);
        this.imageReceiver.setForUserOrChat(tLRPC$Chat, this.avatarDrawable);
    }

    public void setUser(TLRPC$User tLRPC$User) {
        this.avatarDrawable.setInfo(this.currentAccount, tLRPC$User);
        this.imageReceiver.setForUserOrChat(tLRPC$User, this.avatarDrawable);
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.sz);
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2 = (i3 + i5) / 2.0f;
        canvas.drawCircle(this.translateX + f + (AndroidUtilities.dp(this.sz) / 2.0f), this.translateY + f2, AndroidUtilities.dp(this.sz) / 2.0f, this.shadowPaint);
        this.imageReceiver.setImageCoords(this.translateX + f, (this.translateY + f2) - (AndroidUtilities.dp(this.sz) / 2.0f), AndroidUtilities.dp(this.sz), AndroidUtilities.dp(this.sz));
        this.imageReceiver.draw(canvas);
    }
}
