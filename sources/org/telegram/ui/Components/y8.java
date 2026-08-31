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
    public l5 f33393a;
    public l5 f33394b;
    public p9 f33395c;
    public p9 d;
    public q20 f33396e;
    public q20 f33397f;
    public final TextView h;
    public final TLRPC.TL_emojiList f33398n;
    public final int f33399r;
    public int f33400s;
    public int v;
    public float f33401w;
    public boolean f33402x;
    public final x8 f33403y;

    public y8(Context context) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f33399r = i10;
        this.f33400s = 0;
        this.v = 0;
        this.f33401w = 1.0f;
        this.f33403y = new x8((em) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.f33398n = a2;
        this.f33395c = new p9(context);
        this.d = new p9(context);
        addView(this.f33395c, k7.c6.e(50, 50, 1));
        addView(this.d, k7.c6.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            l5 l5Var = new l5(4, i10, a2.document_id.get(0).longValue());
            this.f33393a = l5Var;
            this.f33395c.setAnimatedEmojiDrawable(l5Var);
            b();
        }
        int[] iArr = w8.Z[this.f33400s];
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        q20 q20Var = new q20();
        this.f33396e = q20Var;
        q20Var.d(i11, i12, i13, i14);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J7, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.UseEmoji));
        addView(textView, k7.c6.d(-1, 28.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
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
                    tL_emojiList2.document_id.add(Long.valueOf(document.f20849id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f20849id));
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < stickerSets.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).f20849id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f33402x) {
            return;
        }
        int i10 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f33398n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.f33402x = true;
            return;
        }
        l5 l5Var = new l5(4, this.f33399r, tL_emojiList.document_id.get(i10).longValue());
        this.f33394b = l5Var;
        l5Var.f28606m = true;
        l5Var.v();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        p9 p9Var;
        q20 q20Var = this.f33396e;
        if (q20Var != null) {
            q20Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        q20 q20Var2 = this.f33397f;
        if (q20Var2 != null) {
            q20Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = this.f33401w;
        if (f10 == 1.0f) {
            this.f33396e.f30254c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f33396e.f30254c);
            this.f33395c.setAlpha(1.0f);
            this.f33395c.setScaleX(1.0f);
            this.f33395c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = pr.f30183f.getInterpolation(f10);
            this.f33396e.f30254c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f33396e.f30254c);
            this.f33397f.f30254c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f33397f.f30254c);
            this.f33401w += 0.064f;
            float f11 = 1.0f - interpolation;
            this.f33395c.setAlpha(f11);
            this.f33395c.setScaleX(f11);
            this.f33395c.setScaleY(f11);
            this.f33395c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(p9Var.getMeasuredHeight());
            if (this.f33401w > 1.0f) {
                this.f33401w = 1.0f;
                this.f33396e = this.f33397f;
                p9 p9Var2 = this.f33395c;
                this.f33395c = this.d;
                this.d = p9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public l5 getAnimatedEmoji() {
        return this.f33393a;
    }

    public s8 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = w8.Z[this.f33400s];
        obj.f31006c = iArr[0];
        obj.d = iArr[1];
        obj.f31007e = iArr[2];
        obj.f31008f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f33403y, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f33403y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int top = this.h.getTop();
        int i12 = (int) (top * 0.7f);
        int i13 = (int) ((top - i12) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f33395c.getLayoutParams();
        this.f33395c.getLayoutParams().height = i12;
        layoutParams.width = i12;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i12;
        layoutParams2.width = i12;
        ((FrameLayout.LayoutParams) this.f33395c.getLayoutParams()).topMargin = i13;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i13;
    }
}
