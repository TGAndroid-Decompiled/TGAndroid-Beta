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
public abstract class h9 extends FrameLayout {
    public q5 f26660a;
    public q5 f26661b;
    public x9 f26662c;
    public x9 d;
    public o20 f26663e;
    public o20 f26664f;
    public final TextView h;
    public final TLRPC.TL_emojiList f26665n;
    public final int f26666r;
    public int f26667s;
    public int v;
    public float f26668w;
    public boolean f26669x;
    public final g9 f26670y;

    public h9(Context context) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f26666r = i10;
        this.f26667s = 0;
        this.v = 0;
        this.f26668w = 1.0f;
        this.f26670y = new g9((gm) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.f26665n = a2;
        this.f26662c = new x9(context);
        this.d = new x9(context);
        addView(this.f26662c, w7.x5.e(50, 50, 1));
        addView(this.d, w7.x5.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            q5 q5Var = new q5(4, i10, a2.document_id.get(0).longValue());
            this.f26660a = q5Var;
            this.f26662c.setAnimatedEmojiDrawable(q5Var);
            b();
        }
        int[] iArr = f9.f25962c0[this.f26667s];
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        o20 o20Var = new o20();
        this.f26663e = o20Var;
        o20Var.d(i11, i12, i13, i14);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J7, false));
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
                    tL_emojiList2.document_id.add(Long.valueOf(document.f19875id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f19875id));
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < stickerSets.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).f19875id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f26669x) {
            return;
        }
        int i10 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f26665n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.f26669x = true;
            return;
        }
        q5 q5Var = new q5(4, this.f26666r, tL_emojiList.document_id.get(i10).longValue());
        this.f26661b = q5Var;
        q5Var.f29586m = true;
        q5Var.v();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x9 x9Var;
        o20 o20Var = this.f26663e;
        if (o20Var != null) {
            o20Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        o20 o20Var2 = this.f26664f;
        if (o20Var2 != null) {
            o20Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = this.f26668w;
        if (f7 == 1.0f) {
            this.f26663e.f28930c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f26663e.f28930c);
            this.f26662c.setAlpha(1.0f);
            this.f26662c.setScaleX(1.0f);
            this.f26662c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = pr.f29466f.getInterpolation(f7);
            this.f26663e.f28930c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f26663e.f28930c);
            this.f26664f.f28930c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f26664f.f28930c);
            this.f26668w += 0.064f;
            float f10 = 1.0f - interpolation;
            this.f26662c.setAlpha(f10);
            this.f26662c.setScaleX(f10);
            this.f26662c.setScaleY(f10);
            this.f26662c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(x9Var.getMeasuredHeight());
            if (this.f26668w > 1.0f) {
                this.f26668w = 1.0f;
                this.f26663e = this.f26664f;
                x9 x9Var2 = this.f26662c;
                this.f26662c = this.d;
                this.d = x9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public q5 getAnimatedEmoji() {
        return this.f26660a;
    }

    public b9 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = f9.f25962c0[this.f26667s];
        obj.f24601c = iArr[0];
        obj.d = iArr[1];
        obj.f24602e = iArr[2];
        obj.f24603f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f26670y, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f26670y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int top = this.h.getTop();
        int i12 = (int) (top * 0.7f);
        int i13 = (int) ((top - i12) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f26662c.getLayoutParams();
        this.f26662c.getLayoutParams().height = i12;
        layoutParams.width = i12;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i12;
        layoutParams2.width = i12;
        ((FrameLayout.LayoutParams) this.f26662c.getLayoutParams()).topMargin = i13;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i13;
    }
}
