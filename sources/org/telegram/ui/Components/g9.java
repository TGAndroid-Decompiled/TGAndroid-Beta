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
public abstract class g9 extends FrameLayout {
    public q5 f24235a;
    public q5 f24236b;
    public w9 f24237c;
    public w9 d;
    public p20 e;
    public p20 f24238f;
    public final TextView h;
    public final TLRPC.TL_emojiList f24239n;
    public final int f24240r;
    public int f24241s;
    public int v;
    public float f24242w;
    public boolean f24243x;
    public final f9 f24244y;

    public g9(Context context) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f24240r = i10;
        this.f24241s = 0;
        this.v = 0;
        this.f24242w = 1.0f;
        this.f24244y = new f9((hm) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.f24239n = a2;
        this.f24237c = new w9(context);
        this.d = new w9(context);
        addView(this.f24237c, w7.x5.e(50, 50, 1));
        addView(this.d, w7.x5.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            q5 q5Var = new q5(4, i10, a2.document_id.get(0).longValue());
            this.f24235a = q5Var;
            this.f24237c.setAnimatedEmojiDrawable(q5Var);
            b();
        }
        int[] iArr = e9.f23605c0[this.f24241s];
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
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.J7, false));
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
                    tL_emojiList2.document_id.add(Long.valueOf(document.f18089id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f18089id));
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < stickerSets.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).f18089id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f24243x) {
            return;
        }
        int i10 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f24239n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.f24243x = true;
            return;
        }
        q5 q5Var = new q5(4, this.f24240r, tL_emojiList.document_id.get(i10).longValue());
        this.f24236b = q5Var;
        q5Var.f27232m = true;
        q5Var.v();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        w9 w9Var;
        p20 p20Var = this.e;
        if (p20Var != null) {
            p20Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        p20 p20Var2 = this.f24238f;
        if (p20Var2 != null) {
            p20Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = this.f24242w;
        if (f7 == 1.0f) {
            this.e.f26912c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f26912c);
            this.f24237c.setAlpha(1.0f);
            this.f24237c.setScaleX(1.0f);
            this.f24237c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = rr.f27701f.getInterpolation(f7);
            this.e.f26912c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f26912c);
            this.f24238f.f26912c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f24238f.f26912c);
            this.f24242w += 0.064f;
            float f10 = 1.0f - interpolation;
            this.f24237c.setAlpha(f10);
            this.f24237c.setScaleX(f10);
            this.f24237c.setScaleY(f10);
            this.f24237c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(w9Var.getMeasuredHeight());
            if (this.f24242w > 1.0f) {
                this.f24242w = 1.0f;
                this.e = this.f24238f;
                w9 w9Var2 = this.f24237c;
                this.f24237c = this.d;
                this.d = w9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public q5 getAnimatedEmoji() {
        return this.f24235a;
    }

    public a9 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = e9.f23605c0[this.f24241s];
        obj.f22387c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f22388f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f24244y, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f24244y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int top = this.h.getTop();
        int i12 = (int) (top * 0.7f);
        int i13 = (int) ((top - i12) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f24237c.getLayoutParams();
        this.f24237c.getLayoutParams().height = i12;
        layoutParams.width = i12;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i12;
        layoutParams2.width = i12;
        ((FrameLayout.LayoutParams) this.f24237c.getLayoutParams()).topMargin = i13;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i13;
    }
}
