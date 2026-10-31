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
    public f5 f29552a;
    public f5 f29553b;
    public g9 f29554c;
    public g9 d;
    public u10 e;
    public u10 f29555f;
    public final TextView h;
    public final TLRPC.TL_emojiList f29556n;
    public final int f29557r;
    public int f29558s;
    public int f29559w;
    public float f29560x;
    public boolean f29561y;

    public q8(Context context) {
        super(context);
        int i10 = org.telegram.messenger.d20.f15147s0;
        this.f29557r = i10;
        this.f29558s = 0;
        this.f29559w = 0;
        this.f29560x = 1.0f;
        this.D = new p8((am) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.f29556n = a2;
        this.f29554c = new g9(context);
        this.d = new g9(context);
        addView(this.f29554c, w7.b6.e(50, 50, 1));
        addView(this.d, w7.b6.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            f5 f5Var = new f5(4, i10, a2.document_id.get(0).longValue());
            this.f29552a = f5Var;
            this.f29554c.setAnimatedEmojiDrawable(f5Var);
            b();
        }
        int[] iArr = o8.f28985c0[this.f29558s];
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
        textView.setText(org.telegram.messenger.cd.L0(2131743823, null));
        addView(textView, w7.b6.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i10) {
        TLRPC.TL_emojiList tL_emojiList = org.telegram.messenger.ui.b0(i10).K1;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList s02 = org.telegram.messenger.ui.b0(i10).s0(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (s02.isEmpty()) {
            ArrayList arrayList = org.telegram.messenger.ui.b0(i10).f18345s0[1];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i11);
                TLRPC.Document document = stickerSetCovered.cover;
                if (document != null) {
                    tL_emojiList2.document_id.add(Long.valueOf(document.f19799id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f19799id));
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < s02.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(((int) Utilities.f14520c.nextLong()) % tL_messages_stickerSet.documents.size())).f19799id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f29561y) {
            return;
        }
        int i10 = this.f29559w + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f29556n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.f29561y = true;
            return;
        }
        f5 f5Var = new f5(4, this.f29557r, tL_emojiList.document_id.get(i10).longValue());
        this.f29553b = f5Var;
        f5Var.f25977m = true;
        f5Var.u();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        g9 g9Var;
        u10 u10Var = this.e;
        if (u10Var != null) {
            u10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        u10 u10Var2 = this.f29555f;
        if (u10Var2 != null) {
            u10Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = this.f29560x;
        if (f7 == 1.0f) {
            this.e.f30753c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f30753c);
            this.f29554c.setAlpha(1.0f);
            this.f29554c.setScaleX(1.0f);
            this.f29554c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = gr.f26495f.getInterpolation(f7);
            this.e.f30753c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f30753c);
            this.f29555f.f30753c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f29555f.f30753c);
            this.f29560x += 0.064f;
            float f10 = 1.0f - interpolation;
            this.f29554c.setAlpha(f10);
            this.f29554c.setScaleX(f10);
            this.f29554c.setScaleY(f10);
            this.f29554c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(g9Var.getMeasuredHeight());
            if (this.f29560x > 1.0f) {
                this.f29560x = 1.0f;
                this.e = this.f29555f;
                g9 g9Var2 = this.f29554c;
                this.f29554c = this.d;
                this.d = g9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public f5 getAnimatedEmoji() {
        return this.f29552a;
    }

    public k8 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = o8.f28985c0[this.f29558s];
        obj.f27676c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f27677f = iArr[3];
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
        ViewGroup.LayoutParams layoutParams = this.f29554c.getLayoutParams();
        this.f29554c.getLayoutParams().height = i12;
        layoutParams.width = i12;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i12;
        layoutParams2.width = i12;
        ((FrameLayout.LayoutParams) this.f29554c.getLayoutParams()).topMargin = i13;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i13;
    }
}
