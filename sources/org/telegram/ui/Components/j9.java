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
public abstract class j9 extends FrameLayout {
    public s5 f26259a;
    public s5 f26260b;
    public z9 f26261c;
    public z9 d;
    public b30 e;
    public b30 f26262f;
    public final TextView h;
    public final TLRPC.TL_emojiList f26263n;
    public final int f26264r;
    public int f26265s;
    public int v;
    public float f26266w;
    public boolean f26267x;
    public final i9 f26268y;

    public j9(Context context) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f26264r = i10;
        this.f26265s = 0;
        this.v = 0;
        this.f26266w = 1.0f;
        this.f26268y = new i9((um) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.f26263n = a2;
        this.f26261c = new z9(context);
        this.d = new z9(context);
        addView(this.f26261c, w7.a6.e(50, 50, 1));
        addView(this.d, w7.a6.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            s5 s5Var = new s5(4, i10, a2.document_id.get(0).longValue());
            this.f26259a = s5Var;
            this.f26261c.setAnimatedEmojiDrawable(s5Var);
            b();
        }
        int[] iArr = h9.f25562c0[this.f26265s];
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        b30 b30Var = new b30();
        this.e = b30Var;
        b30Var.d(i11, i12, i13, i14);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.J7, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UseEmoji));
        addView(textView, w7.a6.a(28.0f, 10.0f, 10.0f, 10.0f, 10.0f, -1, 80));
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
                    tL_emojiList2.document_id.add(Long.valueOf(document.f19222id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f19222id));
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < stickerSets.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).f19222id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f26267x) {
            return;
        }
        int i10 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f26263n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.f26267x = true;
            return;
        }
        s5 s5Var = new s5(4, this.f26264r, tL_emojiList.document_id.get(i10).longValue());
        this.f26260b = s5Var;
        s5Var.f29033m = true;
        s5Var.v();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        z9 z9Var;
        b30 b30Var = this.e;
        if (b30Var != null) {
            b30Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        b30 b30Var2 = this.f26262f;
        if (b30Var2 != null) {
            b30Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = this.f26266w;
        if (f7 == 1.0f) {
            this.e.f23685c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f23685c);
            this.f26261c.setAlpha(1.0f);
            this.f26261c.setScaleX(1.0f);
            this.f26261c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = es.f24771f.getInterpolation(f7);
            this.e.f23685c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f23685c);
            this.f26262f.f23685c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f26262f.f23685c);
            this.f26266w += 0.064f;
            float f10 = 1.0f - interpolation;
            this.f26261c.setAlpha(f10);
            this.f26261c.setScaleX(f10);
            this.f26261c.setScaleY(f10);
            this.f26261c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(z9Var.getMeasuredHeight());
            if (this.f26266w > 1.0f) {
                this.f26266w = 1.0f;
                this.e = this.f26262f;
                z9 z9Var2 = this.f26261c;
                this.f26261c = this.d;
                this.d = z9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public s5 getAnimatedEmoji() {
        return this.f26259a;
    }

    public d9 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = h9.f25562c0[this.f26265s];
        obj.f24322c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f24323f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f26268y, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f26268y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int top = this.h.getTop();
        int i12 = (int) (top * 0.7f);
        int i13 = (int) ((top - i12) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f26261c.getLayoutParams();
        this.f26261c.getLayoutParams().height = i12;
        layoutParams.width = i12;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i12;
        layoutParams2.width = i12;
        ((FrameLayout.LayoutParams) this.f26261c.getLayoutParams()).topMargin = i13;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i13;
    }
}
