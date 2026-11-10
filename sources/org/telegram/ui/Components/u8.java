package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class u8 extends FrameLayout {
    public final t8 D;
    public h5 f38587a;
    public h5 f38588b;
    public k9 f38589c;
    public k9 d;
    public e10 f38590e;
    public e10 f38591f;
    public final TextView h;
    public final TLRPC.TL_emojiList f38592n;
    public final int f38593r;
    public int f38594s;
    public int f38595w;
    public float f38596x;
    public boolean f38597y;

    public u8(Context context) {
        super(context);
        int i7 = org.telegram.messenger.p10.f24474s0;
        this.f38593r = i7;
        this.f38594s = 0;
        this.f38595w = 0;
        this.f38596x = 1.0f;
        this.D = new t8((rl) this);
        TLRPC.TL_emojiList a10 = a(i7);
        this.f38592n = a10;
        this.f38589c = new k9(context);
        this.d = new k9(context);
        addView(this.f38589c, c8.ha.e(50, 50, 1));
        addView(this.d, c8.ha.e(50, 50, 1));
        if (!a10.document_id.isEmpty()) {
            h5 h5Var = new h5(4, i7, a10.document_id.get(0).longValue());
            this.f38587a = h5Var;
            this.f38589c.setAnimatedEmojiDrawable(h5Var);
            b();
        }
        int[] iArr = s8.f37885c0[this.f38594s];
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        e10 e10Var = new e10();
        this.f38590e = e10Var;
        e10Var.d(i10, i11, i12, i13);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.J7, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.id.M0(2131743797, null));
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
            ArrayList arrayList = org.telegram.messenger.ui.b0(i7).f25844s0[1];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
                TLRPC.Document document = stickerSetCovered.cover;
                if (document != null) {
                    tL_emojiList2.document_id.add(Long.valueOf(document.f26966id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f26966id));
                    }
                }
            }
        } else {
            for (int i11 = 0; i11 < s02.size(); i11++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i11);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(((int) Utilities.f21340c.nextLong()) % tL_messages_stickerSet.documents.size())).f26966id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f38597y) {
            return;
        }
        int i7 = this.f38595w + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f38592n;
        if (i7 > tL_emojiList.document_id.size() - 1) {
            this.f38597y = true;
            return;
        }
        h5 h5Var = new h5(4, this.f38593r, tL_emojiList.document_id.get(i7).longValue());
        this.f38588b = h5Var;
        h5Var.f34178m = true;
        h5Var.u();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k9 k9Var;
        e10 e10Var = this.f38590e;
        if (e10Var != null) {
            e10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        e10 e10Var2 = this.f38591f;
        if (e10Var2 != null) {
            e10Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = this.f38596x;
        if (f10 == 1.0f) {
            this.f38590e.f33129c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f38590e.f33129c);
            this.f38589c.setAlpha(1.0f);
            this.f38589c.setScaleX(1.0f);
            this.f38589c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = wq.f40046f.getInterpolation(f10);
            this.f38590e.f33129c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f38590e.f33129c);
            this.f38591f.f33129c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f38591f.f33129c);
            this.f38596x += 0.064f;
            float f11 = 1.0f - interpolation;
            this.f38589c.setAlpha(f11);
            this.f38589c.setScaleX(f11);
            this.f38589c.setScaleY(f11);
            this.f38589c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(k9Var.getMeasuredHeight());
            if (this.f38596x > 1.0f) {
                this.f38596x = 1.0f;
                this.f38590e = this.f38591f;
                k9 k9Var2 = this.f38589c;
                this.f38589c = this.d;
                this.d = k9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public h5 getAnimatedEmoji() {
        return this.f38587a;
    }

    public o8 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = s8.f37885c0[this.f38594s];
        obj.f36535c = iArr[0];
        obj.d = iArr[1];
        obj.f36536e = iArr[2];
        obj.f36537f = iArr[3];
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
        ViewGroup.LayoutParams layoutParams = this.f38589c.getLayoutParams();
        this.f38589c.getLayoutParams().height = i11;
        layoutParams.width = i11;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i11;
        layoutParams2.width = i11;
        ((FrameLayout.LayoutParams) this.f38589c.getLayoutParams()).topMargin = i12;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i12;
    }
}
