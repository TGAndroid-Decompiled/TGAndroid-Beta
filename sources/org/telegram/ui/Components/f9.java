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
public abstract class f9 extends FrameLayout {
    public p5 f24134a;
    public p5 f24135b;
    public v9 f24136c;
    public v9 d;
    public o20 e;
    public o20 f24137f;
    public final TextView h;
    public final TLRPC.TL_emojiList f24138n;
    public final int f24139r;
    public int f24140s;
    public int v;
    public float f24141w;
    public boolean f24142x;
    public final e9 f24143y;

    public f9(Context context) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f24139r = i10;
        this.f24140s = 0;
        this.v = 0;
        this.f24141w = 1.0f;
        this.f24143y = new e9((gm) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.f24138n = a2;
        this.f24136c = new v9(context);
        this.d = new v9(context);
        addView(this.f24136c, w7.y5.e(50, 50, 1));
        addView(this.d, w7.y5.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            p5 p5Var = new p5(4, i10, a2.document_id.get(0).longValue());
            this.f24134a = p5Var;
            this.f24136c.setAnimatedEmojiDrawable(p5Var);
            b();
        }
        int[] iArr = d9.f23602c0[this.f24140s];
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
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J7, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UseEmoji));
        addView(textView, w7.y5.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
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
                    tL_emojiList2.document_id.add(Long.valueOf(document.f18349id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f18349id));
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < stickerSets.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).f18349id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f24142x) {
            return;
        }
        int i10 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f24138n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.f24142x = true;
            return;
        }
        p5 p5Var = new p5(4, this.f24139r, tL_emojiList.document_id.get(i10).longValue());
        this.f24135b = p5Var;
        p5Var.f27258m = true;
        p5Var.v();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        v9 v9Var;
        o20 o20Var = this.e;
        if (o20Var != null) {
            o20Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        o20 o20Var2 = this.f24137f;
        if (o20Var2 != null) {
            o20Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = this.f24141w;
        if (f7 == 1.0f) {
            this.e.f26967c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f26967c);
            this.f24136c.setAlpha(1.0f);
            this.f24136c.setScaleX(1.0f);
            this.f24136c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = qr.f27653f.getInterpolation(f7);
            this.e.f26967c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f26967c);
            this.f24137f.f26967c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f24137f.f26967c);
            this.f24141w += 0.064f;
            float f10 = 1.0f - interpolation;
            this.f24136c.setAlpha(f10);
            this.f24136c.setScaleX(f10);
            this.f24136c.setScaleY(f10);
            this.f24136c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(v9Var.getMeasuredHeight());
            if (this.f24141w > 1.0f) {
                this.f24141w = 1.0f;
                this.e = this.f24137f;
                v9 v9Var2 = this.f24136c;
                this.f24136c = this.d;
                this.d = v9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public p5 getAnimatedEmoji() {
        return this.f24134a;
    }

    public z8 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = d9.f23602c0[this.f24140s];
        obj.f30844c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f30845f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f24143y, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f24143y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int top = this.h.getTop();
        int i12 = (int) (top * 0.7f);
        int i13 = (int) ((top - i12) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f24136c.getLayoutParams();
        this.f24136c.getLayoutParams().height = i12;
        layoutParams.width = i12;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i12;
        layoutParams2.width = i12;
        ((FrameLayout.LayoutParams) this.f24136c.getLayoutParams()).topMargin = i13;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i13;
    }
}
