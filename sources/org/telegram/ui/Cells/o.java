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
    public final int f21464a;
    public final int f21465b;
    public final int f21466c;
    public int d;
    public final ArrayList e;
    public float f21467f;
    public float h;
    public Integer f21468n;

    public o(Context context) {
        super(context);
        this.e = new ArrayList();
        this.f21464a = 20;
        this.f21465b = 60;
        this.f21466c = 60;
    }

    public final void a(mg.q0 q0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        TLRPC.Document document;
        org.telegram.ui.Components.l5 m9;
        String findAnimatedEmojiEmoticon;
        if (q0Var.f14107f != null) {
            tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f14107f);
        } else {
            tL_availableReaction = null;
        }
        if (tL_availableReaction == null) {
            document = org.telegram.ui.Components.l5.f(UserConfig.selectedAccount, q0Var.f14108g);
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
            StringBuilder sb = new StringBuilder();
            int i11 = this.f21465b;
            sb.append(i11);
            sb.append("_");
            sb.append(i11);
            sb.append("_nolimit");
            imageReceiver.setImage(forDocument, sb.toString(), null, "tgs", tL_availableReaction2, 1);
            imageReceiver.setAutoRepeat(0);
            imageReceiver.onAttachedToWindow();
            arrayList.add(imageReceiver);
            invalidate();
            return;
        }
        if (document == null) {
            m9 = org.telegram.ui.Components.l5.n(2, q0Var.f14108g, null, UserConfig.selectedAccount);
        } else {
            m9 = org.telegram.ui.Components.l5.m(2, UserConfig.selectedAccount, document);
        }
        if (this.f21468n != null) {
            m9.setColorFilter(new PorterDuffColorFilter(this.f21468n.intValue(), PorterDuff.Mode.MULTIPLY));
        }
        mg.d a2 = mg.d.a(m9, false, !m9.c());
        a2.f(this);
        arrayList.add(a2);
        invalidate();
    }

    public final void b(float f10, float f11) {
        setTranslationX(f10 - (getMeasuredWidth() / 2.0f));
        float measuredHeight = f11 - (getMeasuredHeight() / 2.0f);
        this.f21467f = measuredHeight;
        setTranslationY(measuredHeight + this.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(this.f21466c);
        int dp2 = AndroidUtilities.dp(this.f21465b);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                Object obj = arrayList.get(i10);
                if (obj instanceof ImageReceiver) {
                    ImageReceiver imageReceiver = (ImageReceiver) obj;
                    float f10 = dp2;
                    imageReceiver.setImageCoords((getMeasuredWidth() - dp2) / 2.0f, (getMeasuredHeight() - dp2) / 2.0f, f10, f10);
                    imageReceiver.draw(canvas);
                } else if (obj instanceof mg.d) {
                    mg.d dVar = (mg.d) obj;
                    dVar.e((int) ((getMeasuredWidth() - dp) / 2.0f), (int) ((getMeasuredHeight() - dp) / 2.0f), (int) ((getMeasuredWidth() + dp) / 2.0f), (int) ((getMeasuredHeight() + dp) / 2.0f));
                    dVar.b(canvas);
                    if (dVar.c()) {
                        dVar.d(this);
                        arrayList.remove(dVar);
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
                } else if (obj instanceof mg.d) {
                    ((mg.d) obj).d(this);
                }
            }
        }
        arrayList.clear();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f21464a;
        int i13 = this.f21465b;
        int max = Math.max(i12, i13);
        int i14 = this.f21466c;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.max(i14, max)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.max(i14, Math.max(i12, i13))), 1073741824));
    }

    public void setColor(int i10) {
        this.f21468n = Integer.valueOf(i10);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i11 < arrayList.size()) {
                Object obj = arrayList.get(i11);
                if (obj instanceof ImageReceiver) {
                    ((ImageReceiver) obj).setColorFilter(porterDuffColorFilter);
                } else if (obj instanceof mg.d) {
                    ((mg.d) obj).f13963a.setColorFilter(porterDuffColorFilter2);
                }
                i11++;
            } else {
                return;
            }
        }
    }
}
