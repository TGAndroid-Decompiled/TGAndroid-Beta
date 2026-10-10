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
    public s5 f27270a;
    public s5 f27271b;
    public y9 f27272c;
    public y9 d;
    public g30 f27273e;
    public g30 f27274f;
    public final TextView h;
    public final TLRPC.TL_emojiList f27275n;
    public final int f27276r;
    public int f27277s;
    public int v;
    public float f27278w;
    public boolean f27279x;
    public final h9 f27280y;

    public i9(Context context) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f27276r = i10;
        this.f27277s = 0;
        this.v = 0;
        this.f27278w = 1.0f;
        this.f27280y = new h9((xm) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.f27275n = a2;
        this.f27272c = new y9(context);
        this.d = new y9(context);
        addView(this.f27272c, w7.x5.e(50, 50, 1));
        addView(this.d, w7.x5.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            s5 s5Var = new s5(4, i10, a2.document_id.get(0).longValue());
            this.f27270a = s5Var;
            this.f27272c.setAnimatedEmojiDrawable(s5Var);
            b();
        }
        int[] iArr = g9.f26638c0[this.f27277s];
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        g30 g30Var = new g30();
        this.f27273e = g30Var;
        g30Var.d(i11, i12, i13, i14);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.J7, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UseEmoji));
        addView(textView, w7.x5.a(28.0f, 10.0f, 10.0f, 10.0f, 10.0f, -1, 80));
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
                    tL_emojiList2.document_id.add(Long.valueOf(document.f20048id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f20048id));
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < stickerSets.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).f20048id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f27279x) {
            return;
        }
        int i10 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f27275n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.f27279x = true;
            return;
        }
        s5 s5Var = new s5(4, this.f27276r, tL_emojiList.document_id.get(i10).longValue());
        this.f27271b = s5Var;
        s5Var.f30682m = true;
        s5Var.v();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        y9 y9Var;
        g30 g30Var = this.f27273e;
        if (g30Var != null) {
            g30Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        g30 g30Var2 = this.f27274f;
        if (g30Var2 != null) {
            g30Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = this.f27278w;
        if (f7 == 1.0f) {
            this.f27273e.f26591c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f27273e.f26591c);
            this.f27272c.setAlpha(1.0f);
            this.f27272c.setScaleX(1.0f);
            this.f27272c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = is.f27443f.getInterpolation(f7);
            this.f27273e.f26591c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f27273e.f26591c);
            this.f27274f.f26591c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f27274f.f26591c);
            this.f27278w += 0.064f;
            float f10 = 1.0f - interpolation;
            this.f27272c.setAlpha(f10);
            this.f27272c.setScaleX(f10);
            this.f27272c.setScaleY(f10);
            this.f27272c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(y9Var.getMeasuredHeight());
            if (this.f27278w > 1.0f) {
                this.f27278w = 1.0f;
                this.f27273e = this.f27274f;
                y9 y9Var2 = this.f27272c;
                this.f27272c = this.d;
                this.d = y9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public s5 getAnimatedEmoji() {
        return this.f27270a;
    }

    public c9 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = g9.f26638c0[this.f27277s];
        obj.f25241c = iArr[0];
        obj.d = iArr[1];
        obj.f25242e = iArr[2];
        obj.f25243f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f27280y, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f27280y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int top = this.h.getTop();
        int i12 = (int) (top * 0.7f);
        int i13 = (int) ((top - i12) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f27272c.getLayoutParams();
        this.f27272c.getLayoutParams().height = i12;
        layoutParams.width = i12;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i12;
        layoutParams2.width = i12;
        ((FrameLayout.LayoutParams) this.f27272c.getLayoutParams()).topMargin = i13;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i13;
    }
}
