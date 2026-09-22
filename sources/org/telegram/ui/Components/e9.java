package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class e9 extends FrameLayout {
    public o5 f23583a;
    public o5 f23584b;
    public u9 f23585c;
    public u9 d;
    public o20 e;
    public o20 f23586f;
    public final TextView h;
    public final TLRPC.TL_emojiList f23587n;
    public final int f23588r;
    public int f23589s;
    public int v;
    public float f23590w;
    public boolean f23591x;
    public final d9 f23592y;

    public e9(Context context) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f23588r = i10;
        this.f23589s = 0;
        this.v = 0;
        this.f23590w = 1.0f;
        this.f23592y = new d9((gm) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.f23587n = a2;
        this.f23585c = new u9(context);
        this.d = new u9(context);
        addView(this.f23585c, w7.x5.e(50, 50, 1));
        addView(this.d, w7.x5.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            o5 o5Var = new o5(4, i10, a2.document_id.get(0).longValue());
            this.f23583a = o5Var;
            this.f23585c.setAnimatedEmojiDrawable(o5Var);
            b();
        }
        int[] iArr = c9.f22977c0[this.f23589s];
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        o20 o20Var = new o20();
        this.e = o20Var;
        o20Var.d(i11, i12, i13, i14);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J7, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UseEmoji));
        addView(textView, w7.x5.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i10) {
        TLRPC.TL_emojiList tL_emojiList = MediaDataController.getInstance(i10).groupAvatarConstructorDefault;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (stickerSets.isEmpty()) {
            ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i10).getFeaturedEmojiSets();
            for (int i11 = 0; i11 < featuredEmojiSets.size(); i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i11);
                TLRPC.Document document = stickerSetCovered.cover;
                if (document != null) {
                    tL_emojiList2.document_id.add(Long.valueOf(document.f18115id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f18115id));
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < stickerSets.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).f18115id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f23591x) {
            return;
        }
        int i10 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f23587n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.f23591x = true;
            return;
        }
        o5 o5Var = new o5(4, this.f23588r, tL_emojiList.document_id.get(i10).longValue());
        this.f23584b = o5Var;
        o5Var.f26691m = true;
        o5Var.v();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        u9 u9Var;
        o20 o20Var = this.e;
        if (o20Var != null) {
            o20Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        o20 o20Var2 = this.f23586f;
        if (o20Var2 != null) {
            o20Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = this.f23590w;
        if (f7 == 1.0f) {
            this.e.f26657c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f26657c);
            this.f23585c.setAlpha(1.0f);
            this.f23585c.setScaleX(1.0f);
            this.f23585c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = qr.f27420f.getInterpolation(f7);
            this.e.f26657c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f26657c);
            this.f23586f.f26657c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f23586f.f26657c);
            this.f23590w += 0.064f;
            float f10 = 1.0f - interpolation;
            this.f23585c.setAlpha(f10);
            this.f23585c.setScaleX(f10);
            this.f23585c.setScaleY(f10);
            this.f23585c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(u9Var.getMeasuredHeight());
            if (this.f23590w > 1.0f) {
                this.f23590w = 1.0f;
                this.e = this.f23586f;
                u9 u9Var2 = this.f23585c;
                this.f23585c = this.d;
                this.d = u9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public o5 getAnimatedEmoji() {
        return this.f23583a;
    }

    public y8 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = c9.f22977c0[this.f23589s];
        obj.f30172c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f30173f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f23592y, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f23592y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int top = this.h.getTop();
        int i12 = (int) (top * 0.7f);
        int i13 = (int) ((top - i12) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f23585c.getLayoutParams();
        this.f23585c.getLayoutParams().height = i12;
        layoutParams.width = i12;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i12;
        layoutParams2.width = i12;
        ((FrameLayout.LayoutParams) this.f23585c.getLayoutParams()).topMargin = i13;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i13;
    }
}
