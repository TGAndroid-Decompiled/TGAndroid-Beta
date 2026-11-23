package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class z8 extends FrameLayout {
    public final y8 E;
    public o5 f42745a;
    public o5 f42746b;
    public p9 f42747c;
    public p9 d;
    public q10 f42748e;
    public q10 f42749f;
    public final TextView h;
    public final TLRPC.TL_emojiList f42750n;
    public final int f42751r;
    public int f42752s;
    public int f42753w;
    public float f42754x;
    public boolean f42755y;

    public z8(Context context) {
        super(context);
        int i7 = org.telegram.messenger.i10.f24637t0;
        this.f42751r = i7;
        this.f42752s = 0;
        this.f42753w = 0;
        this.f42754x = 1.0f;
        this.E = new y8((gm) this);
        TLRPC.TL_emojiList a10 = a(i7);
        this.f42750n = a10;
        this.f42747c = new p9(context);
        this.d = new p9(context);
        addView(this.f42747c, c8.na.e(50, 50, 1));
        addView(this.d, c8.na.e(50, 50, 1));
        if (!a10.document_id.isEmpty()) {
            o5 o5Var = new o5(4, i7, a10.document_id.get(0).longValue());
            this.f42745a = o5Var;
            this.f42747c.setAnimatedEmojiDrawable(o5Var);
            b();
        }
        int[] iArr = x8.f41916d0[this.f42752s];
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        q10 q10Var = new q10();
        this.f42748e = q10Var;
        q10Var.d(i10, i11, i12, i13);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.J7, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.gd.N0(2131743550, null));
        addView(textView, c8.na.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i7) {
        TLRPC.TL_emojiList tL_emojiList = org.telegram.messenger.ri.d0(i7).N1;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList u02 = org.telegram.messenger.ri.d0(i7).u0(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (u02.isEmpty()) {
            ArrayList arrayList = org.telegram.messenger.ri.d0(i7).f26740t0[1];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
                TLRPC.Document document = stickerSetCovered.cover;
                if (document != null) {
                    tL_emojiList2.document_id.add(Long.valueOf(document.f28498id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f28498id));
                    }
                }
            }
        } else {
            for (int i11 = 0; i11 < u02.size(); i11++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) u02.get(i11);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(((int) Utilities.f22876c.nextLong()) % tL_messages_stickerSet.documents.size())).f28498id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f42755y) {
            return;
        }
        int i7 = this.f42753w + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f42750n;
        if (i7 > tL_emojiList.document_id.size() - 1) {
            this.f42755y = true;
            return;
        }
        o5 o5Var = new o5(4, this.f42751r, tL_emojiList.document_id.get(i7).longValue());
        this.f42746b = o5Var;
        o5Var.f38030m = true;
        o5Var.u();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        p9 p9Var;
        q10 q10Var = this.f42748e;
        if (q10Var != null) {
            q10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        q10 q10Var2 = this.f42749f;
        if (q10Var2 != null) {
            q10Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = this.f42754x;
        if (f10 == 1.0f) {
            this.f42748e.f38661c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f42748e.f38661c);
            this.f42747c.setAlpha(1.0f);
            this.f42747c.setScaleX(1.0f);
            this.f42747c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = kr.f36858f.getInterpolation(f10);
            this.f42748e.f38661c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f42748e.f38661c);
            this.f42749f.f38661c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f42749f.f38661c);
            this.f42754x += 0.064f;
            float f11 = 1.0f - interpolation;
            this.f42747c.setAlpha(f11);
            this.f42747c.setScaleX(f11);
            this.f42747c.setScaleY(f11);
            this.f42747c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(p9Var.getMeasuredHeight());
            if (this.f42754x > 1.0f) {
                this.f42754x = 1.0f;
                this.f42748e = this.f42749f;
                p9 p9Var2 = this.f42747c;
                this.f42747c = this.d;
                this.d = p9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public o5 getAnimatedEmoji() {
        return this.f42745a;
    }

    public t8 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = x8.f41916d0[this.f42752s];
        obj.f39856c = iArr[0];
        obj.d = iArr[1];
        obj.f39857e = iArr[2];
        obj.f39858f = iArr[3];
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
        ViewGroup.LayoutParams layoutParams = this.f42747c.getLayoutParams();
        this.f42747c.getLayoutParams().height = i11;
        layoutParams.width = i11;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i11;
        layoutParams2.width = i11;
        ((FrameLayout.LayoutParams) this.f42747c.getLayoutParams()).topMargin = i12;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i12;
    }
}
