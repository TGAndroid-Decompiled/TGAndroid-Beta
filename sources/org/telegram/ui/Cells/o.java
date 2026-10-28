package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class o extends View {
    public final int f24571a;
    public final int f24572b;
    public final int f24573c;
    public int d;
    public final ArrayList e;
    public float f24574f;
    public float h;
    public Integer f24575n;

    public o(Context context) {
        super(context);
        this.e = new ArrayList();
        this.f24571a = 20;
        this.f24572b = 60;
        this.f24573c = 60;
    }

    public final void a(bh.x0 x0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        TLRPC.Document document;
        org.telegram.ui.Components.t5 m10;
        String findAnimatedEmojiEmoticon;
        if (x0Var.f4208f != null) {
            tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(x0Var.f4208f);
        } else {
            tL_availableReaction = null;
        }
        if (tL_availableReaction == null) {
            document = org.telegram.ui.Components.t5.f(UserConfig.selectedAccount, x0Var.f4209g);
            if (document != null && (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null)) != null) {
                tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(findAnimatedEmojiEmoticon);
            }
            tL_availableReaction2 = tL_availableReaction;
        } else {
            tL_availableReaction2 = tL_availableReaction;
            document = null;
        }
        ArrayList arrayList = this.e;
        if (document == null && tL_availableReaction2 != null) {
            ImageReceiver imageReceiver = new ImageReceiver();
            imageReceiver.setParentView(this);
            int i10 = this.d;
            this.d = i10 + 1;
            imageReceiver.setUniqKeyPrefix(Integer.toString(i10));
            ImageLocation forDocument = ImageLocation.getForDocument(tL_availableReaction2.around_animation);
            StringBuilder sb2 = new StringBuilder();
            int i11 = this.f24572b;
            sb2.append(i11);
            sb2.append("_");
            sb2.append(i11);
            sb2.append("_nolimit");
            imageReceiver.setImage(forDocument, sb2.toString(), null, "tgs", tL_availableReaction2, 1);
            imageReceiver.setAutoRepeat(0);
            imageReceiver.onAttachedToWindow();
            arrayList.add(imageReceiver);
            invalidate();
            return;
        }
        if (document == null) {
            m10 = org.telegram.ui.Components.t5.n(2, x0Var.f4209g, null, UserConfig.selectedAccount);
        } else {
            m10 = org.telegram.ui.Components.t5.m(2, UserConfig.selectedAccount, document);
        }
        if (this.f24575n != null) {
            m10.setColorFilter(new PorterDuffColorFilter(this.f24575n.intValue(), PorterDuff.Mode.MULTIPLY));
        }
        bh.e a2 = bh.e.a(m10, false, !m10.c());
        a2.f(this);
        arrayList.add(a2);
        invalidate();
    }

    public final void b(float f7, float f10) {
        setTranslationX(f7 - (getMeasuredWidth() / 2.0f));
        float measuredHeight = f10 - (getMeasuredHeight() / 2.0f);
        this.f24574f = measuredHeight;
        setTranslationY(measuredHeight + this.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(this.f24573c);
        int dp2 = AndroidUtilities.dp(this.f24572b);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(i10);
                if (obj instanceof ImageReceiver) {
                    ImageReceiver imageReceiver = (ImageReceiver) obj;
                    float f7 = dp2;
                    imageReceiver.setImageCoords((getMeasuredWidth() - dp2) / 2.0f, (getMeasuredHeight() - dp2) / 2.0f, f7, f7);
                    imageReceiver.draw(canvas);
                } else if (obj instanceof bh.e) {
                    bh.e eVar = (bh.e) obj;
                    eVar.e((int) ((getMeasuredWidth() - dp) / 2.0f), (int) ((getMeasuredHeight() - dp) / 2.0f), (int) ((getMeasuredWidth() + dp) / 2.0f), (int) ((getMeasuredHeight() + dp) / 2.0f));
                    eVar.b(canvas);
                    if (eVar.c()) {
                        eVar.d(this);
                        arrayList.remove(eVar);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (obj instanceof ImageReceiver) {
                    ((ImageReceiver) obj).onDetachedFromWindow();
                } else if (obj instanceof bh.e) {
                    ((bh.e) obj).d(this);
                }
            }
        }
        arrayList.clear();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f24571a;
        int i13 = this.f24572b;
        int max = Math.max(i12, i13);
        int i14 = this.f24573c;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.max(i14, max)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.max(i14, Math.max(i12, i13))), 1073741824));
    }

    public void setColor(int i10) {
        this.f24575n = Integer.valueOf(i10);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i11 < arrayList.size()) {
                Object obj = arrayList.get(i11);
                if (obj instanceof ImageReceiver) {
                    ((ImageReceiver) obj).setColorFilter(porterDuffColorFilter);
                } else if (obj instanceof bh.e) {
                    ((bh.e) obj).f4014a.setColorFilter(porterDuffColorFilter2);
                }
                i11++;
            } else {
                return;
            }
        }
    }
}
