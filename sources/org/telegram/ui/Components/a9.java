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
    public o5 f33289a;
    public o5 f33290b;
    public q9 f33291c;
    public q9 d;
    public p10 f33292e;
    public p10 f33293f;
    public final TextView h;
    public final TLRPC.TL_emojiList f33294n;
    public final int f33295r;
    public int f33296s;
    public int f33297w;
    public float f33298x;
    public boolean f33299y;

    public a9(Context context) {
        super(context);
        int i7 = org.telegram.messenger.j10.f24770t0;
        this.f33295r = i7;
        this.f33296s = 0;
        this.f33297w = 0;
        this.f33298x = 1.0f;
        this.E = new z8((gm) this);
        TLRPC.TL_emojiList a10 = a(i7);
        this.f33294n = a10;
        this.f33291c = new q9(context);
        this.d = new q9(context);
        addView(this.f33291c, c8.ma.e(50, 50, 1));
        addView(this.d, c8.ma.e(50, 50, 1));
        if (!a10.document_id.isEmpty()) {
            o5 o5Var = new o5(4, i7, a10.document_id.get(0).longValue());
            this.f33289a = o5Var;
            this.f33291c.setAnimatedEmojiDrawable(o5Var);
            b();
        }
        int[] iArr = y8.f42392d0[this.f33296s];
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        p10 p10Var = new p10();
        this.f33292e = p10Var;
        p10Var.d(i10, i11, i12, i13);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.J7, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.gd.M0(2131743560, null));
        addView(textView, c8.ma.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i7) {
        TLRPC.TL_emojiList tL_emojiList = org.telegram.messenger.ri.d0(i7).N1;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList u02 = org.telegram.messenger.ri.d0(i7).u0(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (u02.isEmpty()) {
            ArrayList arrayList = org.telegram.messenger.ri.d0(i7).f26639t0[1];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
                TLRPC.Document document = stickerSetCovered.cover;
                if (document != null) {
                    tL_emojiList2.document_id.add(Long.valueOf(document.f28409id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f28409id));
                    }
                }
            }
        } else {
            for (int i11 = 0; i11 < u02.size(); i11++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) u02.get(i11);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(((int) Utilities.f22778c.nextLong()) % tL_messages_stickerSet.documents.size())).f28409id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f33299y) {
            return;
        }
        int i7 = this.f33297w + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f33294n;
        if (i7 > tL_emojiList.document_id.size() - 1) {
            this.f33299y = true;
            return;
        }
        o5 o5Var = new o5(4, this.f33295r, tL_emojiList.document_id.get(i7).longValue());
        this.f33290b = o5Var;
        o5Var.f37978m = true;
        o5Var.u();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        q9 q9Var;
        p10 p10Var = this.f33292e;
        if (p10Var != null) {
            p10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        p10 p10Var2 = this.f33293f;
        if (p10Var2 != null) {
            p10Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = this.f33298x;
        if (f10 == 1.0f) {
            this.f33292e.f38236c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f33292e.f38236c);
            this.f33291c.setAlpha(1.0f);
            this.f33291c.setScaleX(1.0f);
            this.f33291c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = lr.f37208f.getInterpolation(f10);
            this.f33292e.f38236c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f33292e.f38236c);
            this.f33293f.f38236c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f33293f.f38236c);
            this.f33298x += 0.064f;
            float f11 = 1.0f - interpolation;
            this.f33291c.setAlpha(f11);
            this.f33291c.setScaleX(f11);
            this.f33291c.setScaleY(f11);
            this.f33291c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(q9Var.getMeasuredHeight());
            if (this.f33298x > 1.0f) {
                this.f33298x = 1.0f;
                this.f33292e = this.f33293f;
                q9 q9Var2 = this.f33291c;
                this.f33291c = this.d;
                this.d = q9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public o5 getAnimatedEmoji() {
        return this.f33289a;
    }

    public u8 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = y8.f42392d0[this.f33296s];
        obj.f40252c = iArr[0];
        obj.d = iArr[1];
        obj.f40253e = iArr[2];
        obj.f40254f = iArr[3];
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
        ViewGroup.LayoutParams layoutParams = this.f33291c.getLayoutParams();
        this.f33291c.getLayoutParams().height = i11;
        layoutParams.width = i11;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i11;
        layoutParams2.width = i11;
        ((FrameLayout.LayoutParams) this.f33291c.getLayoutParams()).topMargin = i12;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i12;
    }
}
