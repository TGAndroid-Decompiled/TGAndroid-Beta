package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class v8 extends FrameLayout {
    public final u8 D;
    public i5 f38936a;
    public i5 f38937b;
    public l9 f38938c;
    public l9 d;
    public f10 f38939e;
    public f10 f38940f;
    public final TextView h;
    public final TLRPC.TL_emojiList f38941n;
    public final int f38942r;
    public int f38943s;
    public int f38944w;
    public float f38945x;
    public boolean f38946y;

    public v8(Context context) {
        super(context);
        int i7 = org.telegram.messenger.p10.f24470s0;
        this.f38942r = i7;
        this.f38943s = 0;
        this.f38944w = 0;
        this.f38945x = 1.0f;
        this.D = new u8((sl) this);
        TLRPC.TL_emojiList a10 = a(i7);
        this.f38941n = a10;
        this.f38938c = new l9(context);
        this.d = new l9(context);
        addView(this.f38938c, c8.ha.e(50, 50, 1));
        addView(this.d, c8.ha.e(50, 50, 1));
        if (!a10.document_id.isEmpty()) {
            i5 i5Var = new i5(4, i7, a10.document_id.get(0).longValue());
            this.f38936a = i5Var;
            this.f38938c.setAnimatedEmojiDrawable(i5Var);
            b();
        }
        int[] iArr = t8.f38290c0[this.f38943s];
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        f10 f10Var = new f10();
        this.f38939e = f10Var;
        f10Var.d(i10, i11, i12, i13);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.J7, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.id.M0(2131743800, null));
        addView(textView, c8.ha.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i7) {
        TLRPC.TL_emojiList tL_emojiList = org.telegram.messenger.ui.b0(i7).K1;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList s02 = org.telegram.messenger.ui.b0(i7).s0(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (s02.isEmpty()) {
            ArrayList arrayList = org.telegram.messenger.ui.b0(i7).f25840s0[1];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
                TLRPC.Document document = stickerSetCovered.cover;
                if (document != null) {
                    tL_emojiList2.document_id.add(Long.valueOf(document.f26962id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f26962id));
                    }
                }
            }
        } else {
            for (int i11 = 0; i11 < s02.size(); i11++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i11);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(((int) Utilities.f21335c.nextLong()) % tL_messages_stickerSet.documents.size())).f26962id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f38946y) {
            return;
        }
        int i7 = this.f38944w + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f38941n;
        if (i7 > tL_emojiList.document_id.size() - 1) {
            this.f38946y = true;
            return;
        }
        i5 i5Var = new i5(4, this.f38942r, tL_emojiList.document_id.get(i7).longValue());
        this.f38937b = i5Var;
        i5Var.f34543m = true;
        i5Var.u();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l9 l9Var;
        f10 f10Var = this.f38939e;
        if (f10Var != null) {
            f10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        f10 f10Var2 = this.f38940f;
        if (f10Var2 != null) {
            f10Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = this.f38945x;
        if (f10 == 1.0f) {
            this.f38939e.f33433c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f38939e.f33433c);
            this.f38938c.setAlpha(1.0f);
            this.f38938c.setScaleX(1.0f);
            this.f38938c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = xq.f40366f.getInterpolation(f10);
            this.f38939e.f33433c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f38939e.f33433c);
            this.f38940f.f33433c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f38940f.f33433c);
            this.f38945x += 0.064f;
            float f11 = 1.0f - interpolation;
            this.f38938c.setAlpha(f11);
            this.f38938c.setScaleX(f11);
            this.f38938c.setScaleY(f11);
            this.f38938c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(l9Var.getMeasuredHeight());
            if (this.f38945x > 1.0f) {
                this.f38945x = 1.0f;
                this.f38939e = this.f38940f;
                l9 l9Var2 = this.f38938c;
                this.f38938c = this.d;
                this.d = l9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public i5 getAnimatedEmoji() {
        return this.f38936a;
    }

    public p8 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = t8.f38290c0[this.f38943s];
        obj.f36839c = iArr[0];
        obj.d = iArr[1];
        obj.f36840e = iArr[2];
        obj.f36841f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.i3(this.D, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.D);
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int top = this.h.getTop();
        int i11 = (int) (top * 0.7f);
        int i12 = (int) ((top - i11) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f38938c.getLayoutParams();
        this.f38938c.getLayoutParams().height = i11;
        layoutParams.width = i11;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i11;
        layoutParams2.width = i11;
        ((FrameLayout.LayoutParams) this.f38938c.getLayoutParams()).topMargin = i12;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i12;
    }
}
