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

    public final int f24741a;

    public final int f24742b;

    public final int f24743c;
    public int d;

    public final ArrayList f24744e;

    public float f24745f;
    public float h;

    public Integer f24746n;

    public o(Context context) {
        super(context);
        this.f24744e = new ArrayList();
        this.f24741a = 20;
        this.f24742b = 60;
        this.f24743c = 60;
    }

    public final void a(ig.q0 q0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document documentF;
        String strFindAnimatedEmojiEmoticon;
        TLRPC.TL_availableReaction tL_availableReaction2 = q0Var.f11412f != null ? MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f11412f) : null;
        if (tL_availableReaction2 == null) {
            documentF = org.telegram.ui.Components.k5.f(UserConfig.selectedAccount, q0Var.f11413g);
            if (documentF != null && (strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(documentF, null)) != null) {
                tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(strFindAnimatedEmojiEmoticon);
            }
            tL_availableReaction = tL_availableReaction2;
        } else {
            tL_availableReaction = tL_availableReaction2;
            documentF = null;
        }
        ArrayList arrayList = this.f24744e;
        if (documentF != null || tL_availableReaction == null) {
            org.telegram.ui.Components.k5 k5VarN = documentF == null ? org.telegram.ui.Components.k5.n(2, q0Var.f11413g, null, UserConfig.selectedAccount) : org.telegram.ui.Components.k5.m(2, UserConfig.selectedAccount, documentF);
            if (this.f24746n != null) {
                k5VarN.setColorFilter(new PorterDuffColorFilter(this.f24746n.intValue(), PorterDuff.Mode.MULTIPLY));
            }
            ig.d dVarA = ig.d.a(k5VarN, false, !k5VarN.c());
            dVarA.f(this);
            arrayList.add(dVarA);
            invalidate();
            return;
        }
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setParentView(this);
        int i10 = this.d;
        this.d = i10 + 1;
        imageReceiver.setUniqKeyPrefix(Integer.toString(i10));
        ImageLocation forDocument = ImageLocation.getForDocument(tL_availableReaction.around_animation);
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.f24742b;
        sb2.append(i11);
        sb2.append("_");
        sb2.append(i11);
        sb2.append("_nolimit");
        imageReceiver.setImage(forDocument, sb2.toString(), null, "tgs", tL_availableReaction, 1);
        imageReceiver.setAutoRepeat(0);
        imageReceiver.onAttachedToWindow();
        arrayList.add(imageReceiver);
        invalidate();
    }

    public final void b(float f10, float f11) {
        setTranslationX(f10 - (getMeasuredWidth() / 2.0f));
        float measuredHeight = f11 - (getMeasuredHeight() / 2.0f);
        this.f24745f = measuredHeight;
        setTranslationY(measuredHeight + this.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int iDp = AndroidUtilities.dp(this.f24743c);
        int iDp2 = AndroidUtilities.dp(this.f24742b);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f24744e;
            if (i10 >= arrayList.size()) {
                return;
            }
            Object obj = arrayList.get(i10);
            if (obj instanceof ImageReceiver) {
                ImageReceiver imageReceiver = (ImageReceiver) obj;
                float f10 = iDp2;
                imageReceiver.setImageCoords((getMeasuredWidth() - iDp2) / 2.0f, (getMeasuredHeight() - iDp2) / 2.0f, f10, f10);
                imageReceiver.draw(canvas);
            } else if (obj instanceof ig.d) {
                ig.d dVar = (ig.d) obj;
                dVar.e((int) ((getMeasuredWidth() - iDp) / 2.0f), (int) ((getMeasuredHeight() - iDp) / 2.0f), (int) ((getMeasuredWidth() + iDp) / 2.0f), (int) ((getMeasuredHeight() + iDp) / 2.0f));
                dVar.b(canvas);
                if (dVar.c()) {
                    dVar.d(this);
                    arrayList.remove(dVar);
                }
            }
            i10++;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.f24744e;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (obj instanceof ImageReceiver) {
                    ((ImageReceiver) obj).onDetachedFromWindow();
                } else if (obj instanceof ig.d) {
                    ((ig.d) obj).d(this);
                }
            }
        }
        arrayList.clear();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f24741a;
        int i13 = this.f24742b;
        int iMax = Math.max(i12, i13);
        int i14 = this.f24743c;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.max(i14, iMax)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.max(i14, Math.max(i12, i13))), 1073741824));
    }

    public void setColor(int i10) {
        this.f24746n = Integer.valueOf(i10);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f24744e;
            if (i11 >= arrayList.size()) {
                return;
            }
            Object obj = arrayList.get(i11);
            if (obj instanceof ImageReceiver) {
                ((ImageReceiver) obj).setColorFilter(porterDuffColorFilter);
            } else if (obj instanceof ig.d) {
                ((ig.d) obj).f11258a.setColorFilter(porterDuffColorFilter2);
            }
            i11++;
        }
    }
}
