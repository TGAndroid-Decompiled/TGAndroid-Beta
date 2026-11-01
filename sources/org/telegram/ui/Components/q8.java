package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class q8 extends FrameLayout {
    public final p8 D;
    public f5 f29655a;
    public f5 f29656b;
    public g9 f29657c;
    public g9 d;
    public u10 e;
    public u10 f29658f;
    public final TextView h;
    public final TLRPC.TL_emojiList f29659n;
    public final int f29660r;
    public int f29661s;
    public int f29662w;
    public float f29663x;
    public boolean f29664y;

    public q8(Context context) {
        super(context);
        int i10 = org.telegram.messenger.e20.f15506s0;
        this.f29660r = i10;
        this.f29661s = 0;
        this.f29662w = 0;
        this.f29663x = 1.0f;
        this.D = new p8((am) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.f29659n = a2;
        this.f29657c = new g9(context);
        this.d = new g9(context);
        addView(this.f29657c, w7.b6.e(50, 50, 1));
        addView(this.d, w7.b6.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            f5 f5Var = new f5(4, i10, a2.document_id.get(0).longValue());
            this.f29655a = f5Var;
            this.f29657c.setAnimatedEmojiDrawable(f5Var);
            b();
        }
        int[] iArr = o8.f29042c0[this.f29661s];
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        u10 u10Var = new u10();
        this.e = u10Var;
        u10Var.d(i11, i12, i13, i14);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.J7, null);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.dd.L0(2131743823, null));
        addView(textView, w7.b6.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i10) {
        TLRPC.TL_emojiList tL_emojiList = org.telegram.messenger.vi.b0(i10).K1;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList s02 = org.telegram.messenger.vi.b0(i10).s0(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (s02.isEmpty()) {
            ArrayList arrayList = org.telegram.messenger.vi.b0(i10).f18674s0[1];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i11);
                TLRPC.Document document = stickerSetCovered.cover;
                if (document != null) {
                    tL_emojiList2.document_id.add(Long.valueOf(document.f19800id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f19800id));
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < s02.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(((int) Utilities.f14521c.nextLong()) % tL_messages_stickerSet.documents.size())).f19800id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f29664y) {
            return;
        }
        int i10 = this.f29662w + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f29659n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.f29664y = true;
            return;
        }
        f5 f5Var = new f5(4, this.f29660r, tL_emojiList.document_id.get(i10).longValue());
        this.f29656b = f5Var;
        f5Var.f26072m = true;
        f5Var.u();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        g9 g9Var;
        u10 u10Var = this.e;
        if (u10Var != null) {
            u10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        u10 u10Var2 = this.f29658f;
        if (u10Var2 != null) {
            u10Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = this.f29663x;
        if (f7 == 1.0f) {
            this.e.f30808c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f30808c);
            this.f29657c.setAlpha(1.0f);
            this.f29657c.setScaleX(1.0f);
            this.f29657c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = gr.f26523f.getInterpolation(f7);
            this.e.f30808c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f30808c);
            this.f29658f.f30808c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f29658f.f30808c);
            this.f29663x += 0.064f;
            float f10 = 1.0f - interpolation;
            this.f29657c.setAlpha(f10);
            this.f29657c.setScaleX(f10);
            this.f29657c.setScaleY(f10);
            this.f29657c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(g9Var.getMeasuredHeight());
            if (this.f29663x > 1.0f) {
                this.f29663x = 1.0f;
                this.e = this.f29658f;
                g9 g9Var2 = this.f29657c;
                this.f29657c = this.d;
                this.d = g9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public f5 getAnimatedEmoji() {
        return this.f29655a;
    }

    public k8 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = o8.f29042c0[this.f29661s];
        obj.f27770c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f27771f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.i0.h3(this.D, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.i0.r(this.D);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int top = this.h.getTop();
        int i12 = (int) (top * 0.7f);
        int i13 = (int) ((top - i12) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f29657c.getLayoutParams();
        this.f29657c.getLayoutParams().height = i12;
        layoutParams.width = i12;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i12;
        layoutParams2.width = i12;
        ((FrameLayout.LayoutParams) this.f29657c.getLayoutParams()).topMargin = i13;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i13;
    }
}
