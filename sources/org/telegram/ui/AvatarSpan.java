package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
public class AvatarSpan extends ReplacementSpan {
    private final AvatarDrawable avatarDrawable;
    private final int currentAccount;
    private final ImageReceiver imageReceiver;
    private View parent;
    private final View.OnAttachStateChangeListener parentAttachListener;
    private final Paint shadowPaint;
    private int shadowPaintAlpha;
    private float sz;
    private float translateX;
    private float translateY;

    public AvatarSpan(View view, int i) {
        this(view, i, 18.0f);
    }

    public AvatarSpan(View view, int i, float f) {
        this.parentAttachListener = new View.OnAttachStateChangeListener() {
            @Override
            public void onViewAttachedToWindow(View view2) {
                AvatarSpan.this.imageReceiver.onAttachedToWindow();
            }

            @Override
            public void onViewDetachedFromWindow(View view2) {
                AvatarSpan.this.imageReceiver.onDetachedFromWindow();
            }
        };
        this.shadowPaintAlpha = 255;
        this.currentAccount = i;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.imageReceiver = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        this.avatarDrawable = new AvatarDrawable();
        setSize(f);
        Paint paint = new Paint(1);
        this.shadowPaint = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        setParent(view);
    }

    public void setSize(float f) {
        this.imageReceiver.setRoundRadius(AndroidUtilities.dp(f));
        this.sz = f;
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

    public void setDialogId(long j) {
        if (j >= 0) {
            setUser(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)));
        } else {
            setChat(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j)));
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

    public void setImageDrawable(Drawable drawable) {
        this.imageReceiver.setImageBitmap(drawable);
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.sz);
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.shadowPaintAlpha != paint.getAlpha()) {
            Paint paint2 = this.shadowPaint;
            int alpha = paint.getAlpha();
            this.shadowPaintAlpha = alpha;
            paint2.setAlpha(alpha);
            this.shadowPaint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), Theme.multAlpha(855638016, this.shadowPaintAlpha / 255.0f));
        }
        float f2 = (i3 + i5) / 2.0f;
        canvas.drawCircle(this.translateX + f + (AndroidUtilities.dp(this.sz) / 2.0f), this.translateY + f2, AndroidUtilities.dp(this.sz) / 2.0f, this.shadowPaint);
        this.imageReceiver.setImageCoords(this.translateX + f, (this.translateY + f2) - (AndroidUtilities.dp(this.sz) / 2.0f), AndroidUtilities.dp(this.sz), AndroidUtilities.dp(this.sz));
        this.imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        this.imageReceiver.draw(canvas);
    }

    public void translate(float f, float f2) {
        this.translateX = f;
        this.translateY = f2;
    }
}
