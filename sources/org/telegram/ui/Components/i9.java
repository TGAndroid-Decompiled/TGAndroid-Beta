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
public abstract class i9 extends FrameLayout {
    public t5 f29217a;
    public t5 f29218b;
    public y9 f29219c;
    public y9 d;
    public z20 e;
    public z20 f29220f;
    public final TextView h;
    public final TLRPC.TL_emojiList f29221n;
    public final int f29222r;
    public int f29223s;
    public int v;
    public float f29224w;
    public boolean f29225x;
    public final h9 f29226y;

    public i9(Context context) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f29222r = i10;
        this.f29223s = 0;
        this.v = 0;
        this.f29224w = 1.0f;
        this.f29226y = new h9((sm) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.f29221n = a2;
        this.f29219c = new y9(context);
        this.d = new y9(context);
        addView(this.f29219c, gb1.i(50, 50, 1));
        addView(this.d, gb1.i(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            t5 t5Var = new t5(4, i10, a2.document_id.get(0).longValue());
            this.f29217a = t5Var;
            this.f29219c.setAnimatedEmojiDrawable(t5Var);
            b();
        }
        int[] iArr = g9.f28485c0[this.f29223s];
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        z20 z20Var = new z20();
        this.e = z20Var;
        z20Var.d(i11, i12, i13, i14);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.J7, null);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UseEmoji));
        addView(textView, gb1.h(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
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
                    tL_emojiList2.document_id.add(Long.valueOf(document.f22033id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f22033id));
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < stickerSets.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).f22033id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f29225x) {
            return;
        }
        int i10 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f29221n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.f29225x = true;
            return;
        }
        t5 t5Var = new t5(4, this.f29222r, tL_emojiList.document_id.get(i10).longValue());
        this.f29218b = t5Var;
        t5Var.f32851m = true;
        t5Var.v();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        y9 y9Var;
        z20 z20Var = this.e;
        if (z20Var != null) {
            z20Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        z20 z20Var2 = this.f29220f;
        if (z20Var2 != null) {
            z20Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = this.f29224w;
        if (f7 == 1.0f) {
            this.e.f35184c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f35184c);
            this.f29219c.setAlpha(1.0f);
            this.f29219c.setScaleX(1.0f);
            this.f29219c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = ds.f27584f.getInterpolation(f7);
            this.e.f35184c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f35184c);
            this.f29220f.f35184c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f29220f.f35184c);
            this.f29224w += 0.064f;
            float f10 = 1.0f - interpolation;
            this.f29219c.setAlpha(f10);
            this.f29219c.setScaleX(f10);
            this.f29219c.setScaleY(f10);
            this.f29219c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(y9Var.getMeasuredHeight());
            if (this.f29224w > 1.0f) {
                this.f29224w = 1.0f;
                this.e = this.f29220f;
                y9 y9Var2 = this.f29219c;
                this.f29219c = this.d;
                this.d = y9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public t5 getAnimatedEmoji() {
        return this.f29217a;
    }

    public c9 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = g9.f28485c0[this.f29223s];
        obj.f27093c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f27094f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f29226y, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f29226y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int top = this.h.getTop();
        int i12 = (int) (top * 0.7f);
        int i13 = (int) ((top - i12) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f29219c.getLayoutParams();
        this.f29219c.getLayoutParams().height = i12;
        layoutParams.width = i12;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i12;
        layoutParams2.width = i12;
        ((FrameLayout.LayoutParams) this.f29219c.getLayoutParams()).topMargin = i13;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i13;
    }
}
