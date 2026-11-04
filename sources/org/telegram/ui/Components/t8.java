package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class t8 extends FrameLayout {
    public final s8 E;
    public g5 f38338a;
    public g5 f38339b;
    public k9 f38340c;
    public k9 d;
    public b10 f38341e;
    public b10 f38342f;
    public final TextView h;
    public final TLRPC.TL_emojiList f38343n;
    public final int f38344r;
    public int f38345s;
    public int f38346w;
    public float f38347x;
    public boolean f38348y;

    public t8(Context context) {
        super(context);
        int i3 = org.telegram.messenger.h10.f22829t0;
        this.f38344r = i3;
        this.f38345s = 0;
        this.f38346w = 0;
        this.f38347x = 1.0f;
        this.E = new s8((rl) this);
        TLRPC.TL_emojiList a10 = a(i3);
        this.f38343n = a10;
        this.f38340c = new k9(context);
        this.d = new k9(context);
        addView(this.f38340c, b8.mf.e(50, 50, 1));
        addView(this.d, b8.mf.e(50, 50, 1));
        if (!a10.document_id.isEmpty()) {
            g5 g5Var = new g5(4, i3, a10.document_id.get(0).longValue());
            this.f38338a = g5Var;
            this.f38340c.setAnimatedEmojiDrawable(g5Var);
            b();
        }
        int[] iArr = r8.f37665d0[this.f38345s];
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        b10 b10Var = new b10();
        this.f38341e = b10Var;
        b10Var.d(i10, i11, i12, i13);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.J7, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.bd.M0(2131743807, null));
        addView(textView, b8.mf.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i3) {
        TLRPC.TL_emojiList tL_emojiList = org.telegram.messenger.li.b0(i3).L1;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList s02 = org.telegram.messenger.li.b0(i3).s0(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (s02.isEmpty()) {
            ArrayList arrayList = org.telegram.messenger.li.b0(i3).f24051t0[1];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
                TLRPC.Document document = stickerSetCovered.cover;
                if (document != null) {
                    tL_emojiList2.document_id.add(Long.valueOf(document.f27007id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f27007id));
                    }
                }
            }
        } else {
            for (int i11 = 0; i11 < s02.size(); i11++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i11);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(((int) Utilities.f21386c.nextLong()) % tL_messages_stickerSet.documents.size())).f27007id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f38348y) {
            return;
        }
        int i3 = this.f38346w + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f38343n;
        if (i3 > tL_emojiList.document_id.size() - 1) {
            this.f38348y = true;
            return;
        }
        g5 g5Var = new g5(4, this.f38344r, tL_emojiList.document_id.get(i3).longValue());
        this.f38339b = g5Var;
        g5Var.f33973m = true;
        g5Var.u();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k9 k9Var;
        b10 b10Var = this.f38341e;
        if (b10Var != null) {
            b10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        b10 b10Var2 = this.f38342f;
        if (b10Var2 != null) {
            b10Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = this.f38347x;
        if (f10 == 1.0f) {
            this.f38341e.f32038c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f38341e.f32038c);
            this.f38340c.setAlpha(1.0f);
            this.f38340c.setScaleX(1.0f);
            this.f38340c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = xq.f40452f.getInterpolation(f10);
            this.f38341e.f32038c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f38341e.f32038c);
            this.f38342f.f32038c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f38342f.f32038c);
            this.f38347x += 0.064f;
            float f11 = 1.0f - interpolation;
            this.f38340c.setAlpha(f11);
            this.f38340c.setScaleX(f11);
            this.f38340c.setScaleY(f11);
            this.f38340c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(k9Var.getMeasuredHeight());
            if (this.f38347x > 1.0f) {
                this.f38347x = 1.0f;
                this.f38341e = this.f38342f;
                k9 k9Var2 = this.f38340c;
                this.f38340c = this.d;
                this.d = k9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public g5 getAnimatedEmoji() {
        return this.f38338a;
    }

    public n8 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = r8.f37665d0[this.f38345s];
        obj.f36413c = iArr[0];
        obj.d = iArr[1];
        obj.f36414e = iArr[2];
        obj.f36415f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.i3(this.E, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.E);
    }

    @Override
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        int top = this.h.getTop();
        int i11 = (int) (top * 0.7f);
        int i12 = (int) ((top - i11) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f38340c.getLayoutParams();
        this.f38340c.getLayoutParams().height = i11;
        layoutParams.width = i11;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i11;
        layoutParams2.width = i11;
        ((FrameLayout.LayoutParams) this.f38340c.getLayoutParams()).topMargin = i12;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i12;
    }
}
