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
    public q5 f26754a;
    public q5 f26755b;
    public w9 f26756c;
    public w9 d;
    public s20 f26757e;
    public s20 f26758f;
    public final TextView h;
    public final TLRPC.TL_emojiList f26759n;
    public final int f26760r;
    public int f26761s;
    public int v;
    public float f26762w;
    public boolean f26763x;
    public final f9 f26764y;

    public g9(Context context) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f26760r = i10;
        this.f26761s = 0;
        this.v = 0;
        this.f26762w = 1.0f;
        this.f26764y = new f9((jm) this);
        TLRPC.TL_emojiList a2 = a(i10);
        this.f26759n = a2;
        this.f26756c = new w9(context);
        this.d = new w9(context);
        addView(this.f26756c, w7.z5.e(50, 50, 1));
        addView(this.d, w7.z5.e(50, 50, 1));
        if (!a2.document_id.isEmpty()) {
            q5 q5Var = new q5(4, i10, a2.document_id.get(0).longValue());
            this.f26754a = q5Var;
            this.f26756c.setAnimatedEmojiDrawable(q5Var);
            b();
        }
        int[] iArr = e9.f26068c0[this.f26761s];
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        s20 s20Var = new s20();
        this.f26757e = s20Var;
        s20Var.d(i11, i12, i13, i14);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J7, false));
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
                    tL_emojiList2.document_id.add(Long.valueOf(document.f20053id));
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                    if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                        tL_emojiList2.document_id.add(Long.valueOf(tL_stickerSetFullCovered.documents.get(0).f20053id));
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < stickerSets.size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
                if (!tL_messages_stickerSet.documents.isEmpty()) {
                    tL_emojiList2.document_id.add(Long.valueOf(tL_messages_stickerSet.documents.get(Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size())).f20053id));
                }
            }
        }
        return tL_emojiList2;
    }

    public final void b() {
        if (this.f26763x) {
            return;
        }
        int i10 = this.v + 1;
        TLRPC.TL_emojiList tL_emojiList = this.f26759n;
        if (i10 > tL_emojiList.document_id.size() - 1) {
            this.f26763x = true;
            return;
        }
        q5 q5Var = new q5(4, this.f26760r, tL_emojiList.document_id.get(i10).longValue());
        this.f26755b = q5Var;
        q5Var.f29937m = true;
        q5Var.v();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        w9 w9Var;
        s20 s20Var = this.f26757e;
        if (s20Var != null) {
            s20Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        s20 s20Var2 = this.f26758f;
        if (s20Var2 != null) {
            s20Var2.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = this.f26762w;
        if (f7 == 1.0f) {
            this.f26757e.f30660c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f26757e.f30660c);
            this.f26756c.setAlpha(1.0f);
            this.f26756c.setScaleX(1.0f);
            this.f26756c.setScaleY(1.0f);
            this.d.setAlpha(0.0f);
        } else {
            float interpolation = tr.f31215f.getInterpolation(f7);
            this.f26757e.f30660c.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f26757e.f30660c);
            this.f26758f.f30660c.setAlpha((int) (255.0f * interpolation));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f26758f.f30660c);
            this.f26762w += 0.064f;
            float f10 = 1.0f - interpolation;
            this.f26756c.setAlpha(f10);
            this.f26756c.setScaleX(f10);
            this.f26756c.setScaleY(f10);
            this.f26756c.setPivotY(0.0f);
            this.d.setAlpha(interpolation);
            this.d.setScaleX(interpolation);
            this.d.setScaleY(interpolation);
            this.d.setPivotY(w9Var.getMeasuredHeight());
            if (this.f26762w > 1.0f) {
                this.f26762w = 1.0f;
                this.f26757e = this.f26758f;
                w9 w9Var2 = this.f26756c;
                this.f26756c = this.d;
                this.d = w9Var2;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public q5 getAnimatedEmoji() {
        return this.f26754a;
    }

    public a9 getBackgroundGradient() {
        ?? obj = new Object();
        int[] iArr = e9.f26068c0[this.f26761s];
        obj.f24517c = iArr[0];
        obj.d = iArr[1];
        obj.f24518e = iArr[2];
        obj.f24519f = iArr[3];
        return obj;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(this.f26764y, 1000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.f26764y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int top = this.h.getTop();
        int i12 = (int) (top * 0.7f);
        int i13 = (int) ((top - i12) * 0.7f);
        ViewGroup.LayoutParams layoutParams = this.f26756c.getLayoutParams();
        this.f26756c.getLayoutParams().height = i12;
        layoutParams.width = i12;
        ViewGroup.LayoutParams layoutParams2 = this.d.getLayoutParams();
        this.d.getLayoutParams().height = i12;
        layoutParams2.width = i12;
        ((FrameLayout.LayoutParams) this.f26756c.getLayoutParams()).topMargin = i13;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = i13;
    }
}
