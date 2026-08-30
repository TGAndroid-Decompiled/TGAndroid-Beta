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
    public l5 f30920a;
    public l5 f30921b;
    public p9 f30922c;
    public p9 d;
    public p20 e;
    public p20 f30923f;
    public final TextView h;
    public final TLRPC.TL_emojiList f30924n;
    public final int f30925r;
    public int f30926s;
    public int v;
    public float f30927w;
    public boolean f30928x;
    public final x8 f30929y;

    public y8(Context context) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f30925r = i10;
        this.f30926s = 0;
        this.v = 0;
        this.f30927w = 1.0f;
        this.f30929y = new x8((dm) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.f30924n = a2;
        this.f30922c = new p9(context);
        this.d = new p9(context);
        addView(this.f30922c, k7.b6.e(50, 50, 1));
        addView(this.d, k7.b6.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            l5 l5Var = new l5(4, i10, a2.document_id.get(0).longValue());
            this.f30920a = l5Var;
            this.f30922c.setAnimatedEmojiDrawable(l5Var);
            b();
        }
        int[] iArr = w8.Z[this.f30926s];
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        p20 p20Var = new p20();
        this.e = p20Var;
        p20Var.d(i11, i12, i13, i14);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J7, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UseEmoji));
        addView(textView, k7.b6.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
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
                    tL_emojiList2.document_id.add(Long.valueOf(document.f19190id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f19190id));
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < stickerSets.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).f19190id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f30928x) {
            return;
        }
        int i10 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f30924n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.f30928x = true;
            return;
        }
        l5 l5Var = new l5(4, this.f30925r, tL_emojiList.document_id.get(i10).longValue());
        this.f30921b = l5Var;
        l5Var.f26571m = true;
        l5Var.v();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        p9 p9Var;
        p20 p20Var = this.e;
        if (p20Var != null) {
            p20Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        p20 p20Var2 = this.f30923f;
        if (p20Var2 != null) {
            p20Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = this.f30927w;
        if (f10 == 1.0f) {
            this.e.f27713c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f27713c);
            this.f30922c.setAlpha(1.0f);
            this.f30922c.setScaleX(1.0f);
            this.f30922c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = nr.f27346f.getInterpolation(f10);
            this.e.f27713c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f27713c);
            this.f30923f.f27713c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f30923f.f27713c);
            this.f30927w += 0.064f;
            float f11 = 1.0f - interpolation;
            this.f30922c.setAlpha(f11);
            this.f30922c.setScaleX(f11);
            this.f30922c.setScaleY(f11);
            this.f30922c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(p9Var.getMeasuredHeight());
            if (this.f30927w > 1.0f) {
                this.f30927w = 1.0f;
                this.e = this.f30923f;
                p9 p9Var2 = this.f30922c;
                this.f30922c = this.d;
                this.d = p9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public l5 getAnimatedEmoji() {
        return this.f30920a;
    }

    public s8 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = w8.Z[this.f30926s];
        obj.f28667c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f28668f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f30929y, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f30929y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int top = this.h.getTop();
        int i12 = (int) (top * 0.7f);
        int i13 = (int) ((top - i12) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f30922c.getLayoutParams();
        this.f30922c.getLayoutParams().height = i12;
        layoutParams.width = i12;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i12;
        layoutParams2.width = i12;
        ((FrameLayout.LayoutParams) this.f30922c.getLayoutParams()).topMargin = i13;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i13;
    }
}
