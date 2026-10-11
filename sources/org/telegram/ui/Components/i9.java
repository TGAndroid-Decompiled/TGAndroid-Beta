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
    public s5 f27215a;
    public s5 f27216b;
    public y9 f27217c;
    public y9 d;
    public g30 f27218e;
    public g30 f27219f;
    public final TextView h;
    public final TLRPC.TL_emojiList f27220n;
    public final int f27221r;
    public int f27222s;
    public int v;
    public float f27223w;
    public boolean f27224x;
    public final h9 f27225y;

    public i9(Context context) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f27221r = i10;
        this.f27222s = 0;
        this.v = 0;
        this.f27223w = 1.0f;
        this.f27225y = new h9((xm) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.f27220n = a2;
        this.f27217c = new y9(context);
        this.d = new y9(context);
        addView(this.f27217c, w7.x5.e(50, 50, 1));
        addView(this.d, w7.x5.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            s5 s5Var = new s5(4, i10, a2.document_id.get(0).longValue());
            this.f27215a = s5Var;
            this.f27217c.setAnimatedEmojiDrawable(s5Var);
            b();
        }
        int[] iArr = g9.f26631c0[this.f27222s];
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        g30 g30Var = new g30();
        this.f27218e = g30Var;
        g30Var.d(i11, i12, i13, i14);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J7, false));
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
                    tL_emojiList2.document_id.add(Long.valueOf(document.f20038id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f20038id));
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < stickerSets.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).f20038id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f27224x) {
            return;
        }
        int i10 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f27220n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.f27224x = true;
            return;
        }
        s5 s5Var = new s5(4, this.f27221r, tL_emojiList.document_id.get(i10).longValue());
        this.f27216b = s5Var;
        s5Var.f30636m = true;
        s5Var.v();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        y9 y9Var;
        g30 g30Var = this.f27218e;
        if (g30Var != null) {
            g30Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        g30 g30Var2 = this.f27219f;
        if (g30Var2 != null) {
            g30Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = this.f27223w;
        if (f7 == 1.0f) {
            this.f27218e.f26585c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f27218e.f26585c);
            this.f27217c.setAlpha(1.0f);
            this.f27217c.setScaleX(1.0f);
            this.f27217c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = is.f27451f.getInterpolation(f7);
            this.f27218e.f26585c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f27218e.f26585c);
            this.f27219f.f26585c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f27219f.f26585c);
            this.f27223w += 0.064f;
            float f10 = 1.0f - interpolation;
            this.f27217c.setAlpha(f10);
            this.f27217c.setScaleX(f10);
            this.f27217c.setScaleY(f10);
            this.f27217c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(y9Var.getMeasuredHeight());
            if (this.f27223w > 1.0f) {
                this.f27223w = 1.0f;
                this.f27218e = this.f27219f;
                y9 y9Var2 = this.f27217c;
                this.f27217c = this.d;
                this.d = y9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public s5 getAnimatedEmoji() {
        return this.f27215a;
    }

    public c9 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = g9.f26631c0[this.f27222s];
        obj.f25149c = iArr[0];
        obj.d = iArr[1];
        obj.f25150e = iArr[2];
        obj.f25151f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f27225y, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f27225y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int top = this.h.getTop();
        int i12 = (int) (top * 0.7f);
        int i13 = (int) ((top - i12) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f27217c.getLayoutParams();
        this.f27217c.getLayoutParams().height = i12;
        layoutParams.width = i12;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i12;
        layoutParams2.width = i12;
        ((FrameLayout.LayoutParams) this.f27217c.getLayoutParams()).topMargin = i13;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i13;
    }
}
