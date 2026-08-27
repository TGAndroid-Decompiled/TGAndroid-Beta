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

public abstract class x8 extends FrameLayout {

    public k5 f34541a;

    public k5 f34542b;

    public n9 f34543c;
    public n9 d;

    public c20 f34544e;

    public c20 f34545f;
    public final TextView h;

    public final TLRPC.TL_emojiList f34546n;

    public final int f34547r;

    public int f34548s;
    public int v;

    public float f34549w;

    public boolean f34550x;

    public final w8 f34551y;

    public x8(Context context) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f34547r = i10;
        this.f34548s = 0;
        this.v = 0;
        this.f34549w = 1.0f;
        this.f34551y = new w8((tl) this);
        TLRPC.TL_emojiList tL_emojiListA = a(i10);
        this.f34546n = tL_emojiListA;
        this.f34543c = new n9(context);
        this.d = new n9(context);
        addView(this.f34543c, h7.z5.e(50, 50, 1));
        addView(this.d, h7.z5.e(50, 50, 1));
        if (!tL_emojiListA.document_id.isEmpty()) {
            k5 k5Var = new k5(4, i10, tL_emojiListA.document_id.get(0).longValue());
            this.f34541a = k5Var;
            this.f34543c.setAnimatedEmojiDrawable(k5Var);
            b();
        }
        int[] iArr = v8.Y[this.f34548s];
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        c20 c20Var = new c20();
        this.f34544e = c20Var;
        c20Var.d(i11, i12, i13, i14);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J7, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UseEmoji));
        addView(textView, h7.z5.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
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
                    tL_emojiList2.document_id.add(Long.valueOf(document.f22386id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f22386id));
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < stickerSets.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).f22386id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f34550x) {
            return;
        }
        int i10 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f34546n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.f34550x = true;
            return;
        }
        k5 k5Var = new k5(4, this.f34547r, tL_emojiList.document_id.get(i10).longValue());
        this.f34542b = k5Var;
        k5Var.f29963m = true;
        k5Var.v();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c20 c20Var = this.f34544e;
        if (c20Var != null) {
            c20Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        c20 c20Var2 = this.f34545f;
        if (c20Var2 != null) {
            c20Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = this.f34549w;
        if (f10 == 1.0f) {
            this.f34544e.f27292c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f34544e.f27292c);
            this.f34543c.setAlpha(1.0f);
            this.f34543c.setScaleX(1.0f);
            this.f34543c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = er.f28122f.getInterpolation(f10);
            this.f34544e.f27292c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f34544e.f27292c);
            this.f34545f.f27292c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f34545f.f27292c);
            this.f34549w += 0.064f;
            float f11 = 1.0f - interpolation;
            this.f34543c.setAlpha(f11);
            this.f34543c.setScaleX(f11);
            this.f34543c.setScaleY(f11);
            this.f34543c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            n9 n9Var = this.d;
            n9Var.setPivotY(n9Var.getMeasuredHeight());
            if (this.f34549w > 1.0f) {
                this.f34549w = 1.0f;
                this.f34544e = this.f34545f;
                n9 n9Var2 = this.f34543c;
                this.f34543c = this.d;
                this.d = n9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public k5 getAnimatedEmoji() {
        return this.f34541a;
    }

    public r8 getBackgroundGradient() {
        r8 r8Var = new r8();
        int[] iArr = v8.Y[this.f34548s];
        r8Var.f32101c = iArr[0];
        r8Var.d = iArr[1];
        r8Var.f32102e = iArr[2];
        r8Var.f32103f = iArr[3];
        return r8Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f34551y, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f34551y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int top = this.h.getTop();
        int i12 = (int) (top * 0.7f);
        int i13 = (int) ((top - i12) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f34543c.getLayoutParams();
        this.f34543c.getLayoutParams().height = i12;
        layoutParams.width = i12;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i12;
        layoutParams2.width = i12;
        ((FrameLayout.LayoutParams) this.f34543c.getLayoutParams()).topMargin = i13;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i13;
    }
}
