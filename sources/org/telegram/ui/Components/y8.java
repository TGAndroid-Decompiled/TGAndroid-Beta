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
public abstract class y8 extends FrameLayout {
    public k5 f34885a;
    public k5 f34886b;
    public o9 f34887c;
    public o9 d;
    public z10 f34888e;
    public z10 f34889f;
    public final TextView h;
    public final TLRPC.TL_emojiList f34890n;
    public final int f34891r;
    public int f34892s;
    public int v;
    public float f34893w;
    public boolean f34894x;
    public final x8 f34895y;

    public y8(Context context) {
        super(context);
        int i9 = UserConfig.selectedAccount;
        this.f34891r = i9;
        this.f34892s = 0;
        this.v = 0;
        this.f34893w = 1.0f;
        this.f34895y = new x8((xl) this);
        TLRPC.TL_emojiList a2 = a(i9);
        this.f34890n = a2;
        this.f34887c = new o9(context);
        this.d = new o9(context);
        addView(this.f34887c, g7.e6.e(50, 50, 1));
        addView(this.d, g7.e6.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            k5 k5Var = new k5(4, i9, a2.document_id.get(0).longValue());
            this.f34885a = k5Var;
            this.f34887c.setAnimatedEmojiDrawable(k5Var);
            b();
        }
        int[] iArr = w8.Y[this.f34892s];
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        z10 z10Var = new z10();
        this.f34888e = z10Var;
        z10Var.d(i10, i11, i12, i13);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J7, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UseEmoji));
        addView(textView, g7.e6.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
    }

    public static TLRPC.TL_emojiList a(int i9) {
        TLRPC.TL_emojiList tL_emojiList = MediaDataController.getInstance(i9).groupAvatarConstructorDefault;
        if (tL_emojiList != null && !tL_emojiList.document_id.isEmpty()) {
            return tL_emojiList;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i9).getStickerSets(5);
        TLRPC.TL_emojiList tL_emojiList2 = new TLRPC.TL_emojiList();
        if (stickerSets.isEmpty()) {
            ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i9).getFeaturedEmojiSets();
            for (int i10 = 0; i10 < featuredEmojiSets.size(); i10++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i10);
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
            for (int i11 = 0; i11 < stickerSets.size(); i11++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i11);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).f22386id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f34894x) {
            return;
        }
        int i9 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f34890n;
        if (i9 > tL_emojiList.document_id.size() - 1) {
            this.f34894x = true;
            return;
        }
        k5 k5Var = new k5(4, this.f34891r, tL_emojiList.document_id.get(i9).longValue());
        this.f34886b = k5Var;
        k5Var.f29953m = true;
        k5Var.v();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o9 o9Var;
        z10 z10Var = this.f34888e;
        if (z10Var != null) {
            z10Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        z10 z10Var2 = this.f34889f;
        if (z10Var2 != null) {
            z10Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = this.f34893w;
        if (f10 == 1.0f) {
            this.f34888e.f35155c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f34888e.f35155c);
            this.f34887c.setAlpha(1.0f);
            this.f34887c.setScaleX(1.0f);
            this.f34887c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = gr.f28844f.getInterpolation(f10);
            this.f34888e.f35155c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f34888e.f35155c);
            this.f34889f.f35155c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f34889f.f35155c);
            this.f34893w += 0.064f;
            float f11 = 1.0f - interpolation;
            this.f34887c.setAlpha(f11);
            this.f34887c.setScaleX(f11);
            this.f34887c.setScaleY(f11);
            this.f34887c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(o9Var.getMeasuredHeight());
            if (this.f34893w > 1.0f) {
                this.f34893w = 1.0f;
                this.f34888e = this.f34889f;
                o9 o9Var2 = this.f34887c;
                this.f34887c = this.d;
                this.d = o9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public k5 getAnimatedEmoji() {
        return this.f34885a;
    }

    public s8 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = w8.Y[this.f34892s];
        obj.f32393c = iArr[0];
        obj.d = iArr[1];
        obj.f32394e = iArr[2];
        obj.f32395f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f34895y, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f34895y);
    }

    @Override
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int top = this.h.getTop();
        int i11 = (int) (top * 0.7f);
        int i12 = (int) ((top - i11) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f34887c.getLayoutParams();
        this.f34887c.getLayoutParams().height = i11;
        layoutParams.width = i11;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i11;
        layoutParams2.width = i11;
        ((FrameLayout.LayoutParams) this.f34887c.getLayoutParams()).topMargin = i12;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i12;
    }
}
