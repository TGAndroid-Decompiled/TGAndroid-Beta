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
public abstract class e9 extends FrameLayout {
    public p5 f25985a;
    public p5 f25986b;
    public u9 f25987c;
    public u9 d;
    public v20 e;
    public v20 f25988f;
    public final TextView h;
    public final TLRPC.TL_emojiList f25989n;
    public final int f25990r;
    public int f25991s;
    public int v;
    public float f25992w;
    public boolean f25993x;
    public final d9 f25994y;

    public e9(Context context) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f25990r = i10;
        this.f25991s = 0;
        this.v = 0;
        this.f25992w = 1.0f;
        this.f25994y = new d9((pm) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.f25989n = a2;
        this.f25987c = new u9(context);
        this.d = new u9(context);
        addView(this.f25987c, w7.z5.e(50, 50, 1));
        addView(this.d, w7.z5.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            p5 p5Var = new p5(4, i10, a2.document_id.get(0).longValue());
            this.f25985a = p5Var;
            this.f25987c.setAnimatedEmojiDrawable(p5Var);
            b();
        }
        int[] iArr = c9.f25254c0[this.f25991s];
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        v20 v20Var = new v20();
        this.e = v20Var;
        v20Var.d(i11, i12, i13, i14);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.J7, null);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UseEmoji));
        addView(textView, w7.z5.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
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
                    tL_emojiList2.document_id.add(Long.valueOf(document.f20350id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f20350id));
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < stickerSets.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).f20350id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f25993x) {
            return;
        }
        int i10 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f25989n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.f25993x = true;
            return;
        }
        p5 p5Var = new p5(4, this.f25990r, tL_emojiList.document_id.get(i10).longValue());
        this.f25986b = p5Var;
        p5Var.f29486m = true;
        p5Var.v();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        u9 u9Var;
        v20 v20Var = this.e;
        if (v20Var != null) {
            v20Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        v20 v20Var2 = this.f25988f;
        if (v20Var2 != null) {
            v20Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = this.f25992w;
        if (f7 == 1.0f) {
            this.e.f31270c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f31270c);
            this.f25987c.setAlpha(1.0f);
            this.f25987c.setScaleX(1.0f);
            this.f25987c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = zr.f33337f.getInterpolation(f7);
            this.e.f31270c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.e.f31270c);
            this.f25988f.f31270c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f25988f.f31270c);
            this.f25992w += 0.064f;
            float f10 = 1.0f - interpolation;
            this.f25987c.setAlpha(f10);
            this.f25987c.setScaleX(f10);
            this.f25987c.setScaleY(f10);
            this.f25987c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(u9Var.getMeasuredHeight());
            if (this.f25992w > 1.0f) {
                this.f25992w = 1.0f;
                this.e = this.f25988f;
                u9 u9Var2 = this.f25987c;
                this.f25987c = this.d;
                this.d = u9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public p5 getAnimatedEmoji() {
        return this.f25985a;
    }

    public y8 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = c9.f25254c0[this.f25991s];
        obj.f32842c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f32843f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f25994y, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f25994y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int top = this.h.getTop();
        int i12 = (int) (top * 0.7f);
        int i13 = (int) ((top - i12) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f25987c.getLayoutParams();
        this.f25987c.getLayoutParams().height = i12;
        layoutParams.width = i12;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i12;
        layoutParams2.width = i12;
        ((FrameLayout.LayoutParams) this.f25987c.getLayoutParams()).topMargin = i13;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i13;
    }
}
