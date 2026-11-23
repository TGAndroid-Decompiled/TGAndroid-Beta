package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class a9 extends FrameLayout {
    public final z8 E;
    public p5 f33396a;
    public p5 f33397b;
    public q9 f33398c;
    public q9 d;
    public s10 f33399e;
    public s10 f33400f;
    public final TextView h;
    public final TLRPC.TL_emojiList f33401n;
    public final int f33402r;
    public int f33403s;
    public int f33404w;
    public float f33405x;
    public boolean f33406y;

    public a9(Context context) {
        super(context);
        int i7 = org.telegram.messenger.k10.f24932t0;
        this.f33402r = i7;
        this.f33403s = 0;
        this.f33404w = 0;
        this.f33405x = 1.0f;
        this.E = new z8((im) this);
        TLRPC.TL_emojiList a10 = a(i7);
        this.f33401n = a10;
        this.f33398c = new q9(context);
        this.d = new q9(context);
        addView(this.f33398c, c8.na.e(50, 50, 1));
        addView(this.d, c8.na.e(50, 50, 1));
        if (!a10.document_id.isEmpty()) {
            p5 p5Var = new p5(4, i7, a10.document_id.get(0).longValue());
            this.f33396a = p5Var;
            this.f33398c.setAnimatedEmojiDrawable(p5Var);
            b();
        }
        int[] iArr = y8.f42318d0[this.f33403s];
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        s10 s10Var = new s10();
        this.f33399e = s10Var;
        s10Var.d(i10, i11, i12, i13);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.J7, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.hd.N0(2131743554, null));
        addView(textView, c8.na.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i7) {
        TLRPC.TL_emojiList tL_emojiList = org.telegram.messenger.si.d0(i7).N1;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList u02 = org.telegram.messenger.si.d0(i7).u0(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (u02.isEmpty()) {
            ArrayList arrayList = org.telegram.messenger.si.d0(i7).f26817t0[1];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
                TLRPC.Document document = stickerSetCovered.cover;
                if (document != null) {
                    tL_emojiList2.document_id.add(Long.valueOf(document.f28404id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f28404id));
                    }
                }
            }
        } else {
            for (int i11 = 0; i11 < u02.size(); i11++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) u02.get(i11);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(((int) Utilities.f22773c.nextLong()) % tL_messages_stickerSet.documents.size())).f28404id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f33406y) {
            return;
        }
        int i7 = this.f33404w + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f33401n;
        if (i7 > tL_emojiList.document_id.size() - 1) {
            this.f33406y = true;
            return;
        }
        p5 p5Var = new p5(4, this.f33402r, tL_emojiList.document_id.get(i7).longValue());
        this.f33397b = p5Var;
        p5Var.f38459m = true;
        p5Var.u();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        q9 q9Var;
        s10 s10Var = this.f33399e;
        if (s10Var != null) {
            s10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        s10 s10Var2 = this.f33400f;
        if (s10Var2 != null) {
            s10Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = this.f33405x;
        if (f10 == 1.0f) {
            this.f33399e.f39403c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f33399e.f39403c);
            this.f33398c.setAlpha(1.0f);
            this.f33398c.setScaleX(1.0f);
            this.f33398c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = nr.f37917f.getInterpolation(f10);
            this.f33399e.f39403c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f33399e.f39403c);
            this.f33400f.f39403c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f33400f.f39403c);
            this.f33405x += 0.064f;
            float f11 = 1.0f - interpolation;
            this.f33398c.setAlpha(f11);
            this.f33398c.setScaleX(f11);
            this.f33398c.setScaleY(f11);
            this.f33398c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(q9Var.getMeasuredHeight());
            if (this.f33405x > 1.0f) {
                this.f33405x = 1.0f;
                this.f33399e = this.f33400f;
                q9 q9Var2 = this.f33398c;
                this.f33398c = this.d;
                this.d = q9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public p5 getAnimatedEmoji() {
        return this.f33396a;
    }

    public u8 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = y8.f42318d0[this.f33403s];
        obj.f40274c = iArr[0];
        obj.d = iArr[1];
        obj.f40275e = iArr[2];
        obj.f40276f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.h3(this.E, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.E);
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int top = this.h.getTop();
        int i11 = (int) (top * 0.7f);
        int i12 = (int) ((top - i11) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f33398c.getLayoutParams();
        this.f33398c.getLayoutParams().height = i11;
        layoutParams.width = i11;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i11;
        layoutParams2.width = i11;
        ((FrameLayout.LayoutParams) this.f33398c.getLayoutParams()).topMargin = i12;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i12;
    }
}
