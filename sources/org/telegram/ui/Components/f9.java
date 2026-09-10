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
    public p5 f22937a;
    public p5 f22938b;
    public w9 f22939c;
    public w9 d;
    public x20 e;
    public x20 f22940f;
    public final TextView h;
    public final TLRPC.TL_emojiList f22941n;
    public final int f22942r;
    public int f22943s;
    public int v;
    public float f22944w;
    public boolean f22945x;
    public final e9 f22946y;

    public f9(Context context) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f22942r = i10;
        this.f22943s = 0;
        this.v = 0;
        this.f22944w = 1.0f;
        this.f22946y = new e9((mm) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.f22941n = a2;
        this.f22939c = new w9(context);
        this.d = new w9(context);
        addView(this.f22939c, w7.a6.e(50, 50, 1));
        addView(this.d, w7.a6.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            p5 p5Var = new p5(4, i10, a2.document_id.get(0).longValue());
            this.f22937a = p5Var;
            this.f22939c.setAnimatedEmojiDrawable(p5Var);
            b();
        }
        int[] iArr = d9.f22323c0[this.f22943s];
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        x20 x20Var = new x20();
        this.e = x20Var;
        x20Var.d(i11, i12, i13, i14);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J7, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UseEmoji));
        addView(textView, w7.a6.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
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
                    tL_emojiList2.document_id.add(Long.valueOf(document.f17201id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f17201id));
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < stickerSets.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).f17201id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f22945x) {
            return;
        }
        int i10 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f22941n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.f22945x = true;
            return;
        }
        p5 p5Var = new p5(4, this.f22942r, tL_emojiList.document_id.get(i10).longValue());
        this.f22938b = p5Var;
        p5Var.f26035m = true;
        p5Var.v();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        w9 w9Var;
        x20 x20Var = this.e;
        if (x20Var != null) {
            x20Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        x20 x20Var2 = this.f22940f;
        if (x20Var2 != null) {
            x20Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = this.f22944w;
        if (f7 == 1.0f) {
            this.e.f28915c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f28915c);
            this.f22939c.setAlpha(1.0f);
            this.f22939c.setScaleX(1.0f);
            this.f22939c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = wr.f28819f.getInterpolation(f7);
            this.e.f28915c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f28915c);
            this.f22940f.f28915c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f22940f.f28915c);
            this.f22944w += 0.064f;
            float f10 = 1.0f - interpolation;
            this.f22939c.setAlpha(f10);
            this.f22939c.setScaleX(f10);
            this.f22939c.setScaleY(f10);
            this.f22939c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(w9Var.getMeasuredHeight());
            if (this.f22944w > 1.0f) {
                this.f22944w = 1.0f;
                this.e = this.f22940f;
                w9 w9Var2 = this.f22939c;
                this.f22939c = this.d;
                this.d = w9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public p5 getAnimatedEmoji() {
        return this.f22937a;
    }

    public z8 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = d9.f22323c0[this.f22943s];
        obj.f29615c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f29616f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f22946y, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f22946y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int top = this.h.getTop();
        int i12 = (int) (top * 0.7f);
        int i13 = (int) ((top - i12) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f22939c.getLayoutParams();
        this.f22939c.getLayoutParams().height = i12;
        layoutParams.width = i12;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i12;
        layoutParams2.width = i12;
        ((FrameLayout.LayoutParams) this.f22939c.getLayoutParams()).topMargin = i13;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i13;
    }
}
