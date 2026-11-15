package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class s8 extends FrameLayout {
    public final r8 E;
    public g5 f39202a;
    public g5 f39203b;
    public i9 f39204c;
    public i9 d;
    public i10 f39205e;
    public i10 f39206f;
    public final TextView h;
    public final TLRPC.TL_emojiList f39207n;
    public final int f39208r;
    public int f39209s;
    public int f39210w;
    public float f39211x;
    public boolean f39212y;

    public s8(Context context) {
        super(context);
        int i7 = org.telegram.messenger.m10.f24940t0;
        this.f39208r = i7;
        this.f39209s = 0;
        this.f39210w = 0;
        this.f39211x = 1.0f;
        this.E = new r8((zl) this);
        TLRPC.TL_emojiList a10 = a(i7);
        this.f39207n = a10;
        this.f39204c = new i9(context);
        this.d = new i9(context);
        addView(this.f39204c, c8.ja.e(50, 50, 1));
        addView(this.d, c8.ja.e(50, 50, 1));
        if (!a10.document_id.isEmpty()) {
            g5 g5Var = new g5(4, i7, a10.document_id.get(0).longValue());
            this.f39202a = g5Var;
            this.f39204c.setAnimatedEmojiDrawable(g5Var);
            b();
        }
        int[] iArr = q8.f38560d0[this.f39209s];
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        i10 i10Var = new i10();
        this.f39205e = i10Var;
        i10Var.d(i10, i11, i12, i13);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.J7, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.hd.M0(2131743797, null));
        addView(textView, c8.ja.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i7) {
        TLRPC.TL_emojiList tL_emojiList = org.telegram.messenger.si.b0(i7).L1;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList s02 = org.telegram.messenger.si.b0(i7).s0(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (s02.isEmpty()) {
            ArrayList arrayList = org.telegram.messenger.si.b0(i7).f26511t0[1];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
                TLRPC.Document document = stickerSetCovered.cover;
                if (document != null) {
                    tL_emojiList2.document_id.add(Long.valueOf(document.f28057id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f28057id));
                    }
                }
            }
        } else {
            for (int i11 = 0; i11 < s02.size(); i11++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) s02.get(i11);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(((int) Utilities.f22415c.nextLong()) % tL_messages_stickerSet.documents.size())).f28057id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f39212y) {
            return;
        }
        int i7 = this.f39210w + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f39207n;
        if (i7 > tL_emojiList.document_id.size() - 1) {
            this.f39212y = true;
            return;
        }
        g5 g5Var = new g5(4, this.f39208r, tL_emojiList.document_id.get(i7).longValue());
        this.f39203b = g5Var;
        g5Var.f34815m = true;
        g5Var.u();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i9 i9Var;
        i10 i10Var = this.f39205e;
        if (i10Var != null) {
            i10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        i10 i10Var2 = this.f39206f;
        if (i10Var2 != null) {
            i10Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = this.f39211x;
        if (f10 == 1.0f) {
            this.f39205e.f35408c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f39205e.f35408c);
            this.f39204c.setAlpha(1.0f);
            this.f39204c.setScaleX(1.0f);
            this.f39204c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = er.f34419f.getInterpolation(f10);
            this.f39205e.f35408c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f39205e.f35408c);
            this.f39206f.f35408c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f39206f.f35408c);
            this.f39211x += 0.064f;
            float f11 = 1.0f - interpolation;
            this.f39204c.setAlpha(f11);
            this.f39204c.setScaleX(f11);
            this.f39204c.setScaleY(f11);
            this.f39204c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(i9Var.getMeasuredHeight());
            if (this.f39211x > 1.0f) {
                this.f39211x = 1.0f;
                this.f39205e = this.f39206f;
                i9 i9Var2 = this.f39204c;
                this.f39204c = this.d;
                this.d = i9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public g5 getAnimatedEmoji() {
        return this.f39202a;
    }

    public m8 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = q8.f38560d0[this.f39209s];
        obj.f37163c = iArr[0];
        obj.d = iArr[1];
        obj.f37164e = iArr[2];
        obj.f37165f = iArr[3];
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
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int top = this.h.getTop();
        int i11 = (int) (top * 0.7f);
        int i12 = (int) ((top - i11) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f39204c.getLayoutParams();
        this.f39204c.getLayoutParams().height = i11;
        layoutParams.width = i11;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i11;
        layoutParams2.width = i11;
        ((FrameLayout.LayoutParams) this.f39204c.getLayoutParams()).topMargin = i12;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i12;
    }
}
