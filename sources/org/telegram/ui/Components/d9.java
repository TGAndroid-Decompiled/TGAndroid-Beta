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
public abstract class d9 extends FrameLayout {
    public p5 f27706a;
    public p5 f27707b;
    public t9 f27708c;
    public t9 d;
    public k20 f27709e;
    public k20 f27710f;
    public final TextView h;
    public final TLRPC.TL_emojiList f27711n;
    public final int f27712r;
    public int f27713s;
    public int v;
    public float f27714w;
    public boolean f27715x;
    public final c9 f27716y;

    public d9(Context context) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f27712r = i10;
        this.f27713s = 0;
        this.v = 0;
        this.f27714w = 1.0f;
        this.f27716y = new c9((bm) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.f27711n = a2;
        this.f27708c = new t9(context);
        this.d = new t9(context);
        addView(this.f27708c, i7.f6.e(50, 50, 1));
        addView(this.d, i7.f6.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            p5 p5Var = new p5(4, i10, a2.document_id.get(0).longValue());
            this.f27706a = p5Var;
            this.f27708c.setAnimatedEmojiDrawable(p5Var);
            b();
        }
        int[] iArr = b9.Y[this.f27713s];
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        k20 k20Var = new k20();
        this.f27709e = k20Var;
        k20Var.d(i11, i12, i13, i14);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J7, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UseEmoji));
        addView(textView, i7.f6.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
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
                    tL_emojiList2.document_id.add(Long.valueOf(document.f22398id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f22398id));
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < stickerSets.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).f22398id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f27715x) {
            return;
        }
        int i10 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f27711n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.f27715x = true;
            return;
        }
        p5 p5Var = new p5(4, this.f27712r, tL_emojiList.document_id.get(i10).longValue());
        this.f27707b = p5Var;
        p5Var.f31595m = true;
        p5Var.v();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        t9 t9Var;
        k20 k20Var = this.f27709e;
        if (k20Var != null) {
            k20Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        k20 k20Var2 = this.f27710f;
        if (k20Var2 != null) {
            k20Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f9 = this.f27714w;
        if (f9 == 1.0f) {
            this.f27709e.f29893c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f27709e.f29893c);
            this.f27708c.setAlpha(1.0f);
            this.f27708c.setScaleX(1.0f);
            this.f27708c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = jr.f29800f.getInterpolation(f9);
            this.f27709e.f29893c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f27709e.f29893c);
            this.f27710f.f29893c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f27710f.f29893c);
            this.f27714w += 0.064f;
            float f10 = 1.0f - interpolation;
            this.f27708c.setAlpha(f10);
            this.f27708c.setScaleX(f10);
            this.f27708c.setScaleY(f10);
            this.f27708c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(t9Var.getMeasuredHeight());
            if (this.f27714w > 1.0f) {
                this.f27714w = 1.0f;
                this.f27709e = this.f27710f;
                t9 t9Var2 = this.f27708c;
                this.f27708c = this.d;
                this.d = t9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public p5 getAnimatedEmoji() {
        return this.f27706a;
    }

    public x8 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = b9.Y[this.f27713s];
        obj.f34650c = iArr[0];
        obj.d = iArr[1];
        obj.f34651e = iArr[2];
        obj.f34652f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f27716y, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f27716y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int top = this.h.getTop();
        int i12 = (int) (top * 0.7f);
        int i13 = (int) ((top - i12) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f27708c.getLayoutParams();
        this.f27708c.getLayoutParams().height = i12;
        layoutParams.width = i12;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i12;
        layoutParams2.width = i12;
        ((FrameLayout.LayoutParams) this.f27708c.getLayoutParams()).topMargin = i13;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i13;
    }
}
