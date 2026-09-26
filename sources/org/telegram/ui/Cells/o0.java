package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.VelocityTracker;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.yc;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final an0 E;
    public n0 F;
    public na G;
    public final u1 f20733a;
    public int f20734b;
    public long f20735c;
    public MessageObject d;
    public long e;
    public StaticLayout f20737g;
    public float h;
    public float f20738i;
    public int f20739j;
    public float f20744o;
    public float f20745p;
    public s90 f20748s;
    public final org.telegram.ui.Components.e6 f20750u;
    public u01 v;
    public final yc f20753y;
    public final TextPaint f20736f = new TextPaint(1);
    public final Paint f20740k = new Paint(1);
    public final Path f20741l = new Path();
    public final float f20742m = -1.0f;
    public int f20743n = AndroidUtilities.dp(66.0f);
    public final ArrayList f20746q = new ArrayList();
    public final Path f20747r = new Path();
    public final RectF f20751w = new RectF();
    public final RectF f20752x = new RectF();
    public final Paint f20754z = new Paint(1);
    public boolean f20749t = true;

    public o0(u1 u1Var) {
        this.f20733a = u1Var;
        this.E = new an0(u1Var.getContext(), null);
        this.f20753y = new yc(u1Var);
        this.f20750u = new org.telegram.ui.Components.e6(u1Var, 350L, sr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        an0 an0Var = this.E;
        if (an0Var.b()) {
            float f7 = an0Var.f22707j;
            this.f20744o = f7;
            this.f20744o = Utilities.clamp(f7, this.f20745p - (this.f20751w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f20733a.a3();
        }
    }

    public final void c(android.graphics.Canvas r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f20746q.size() > 0) {
            return true;
        }
        return false;
    }

    public final void e(MessageObject messageObject) {
        StaticLayout staticLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        int i10;
        TLObject tLObject;
        TLObject tLObject2;
        int i11;
        int i12;
        this.f20734b = messageObject.currentAccount;
        this.d = messageObject;
        this.f20735c = messageObject.getDialogId();
        MessagesController.getInstance(this.f20734b).getChat(Long.valueOf(-this.f20735c));
        this.e = -this.f20735c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f20736f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.h6.f19154ic;
        u1 u1Var = this.f20733a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(i13, u1Var.Id));
        this.f20737g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f20738i = 0.0f;
        for (int i14 = 0; i14 < this.f20737g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f20737g.getLineLeft(i14));
            this.f20738i = Math.max(this.f20738i, this.f20737g.getLineRight(i14));
        }
        this.f20739j = this.f20737g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f20754z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.W5, u1Var.Id));
        u1Var.f21512s0 = AndroidUtilities.dp(14.66f) + this.f20739j;
        int i15 = 0;
        while (true) {
            arrayList = this.f20746q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f20665c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f20734b).getChannelRecommendations(this.f20735c);
        if (channelRecommendations != null && channelRecommendations.chats != null) {
            arrayList2 = new ArrayList(channelRecommendations.chats);
        } else {
            arrayList2 = new ArrayList();
        }
        int i17 = 0;
        while (i17 < arrayList2.size()) {
            TLObject tLObject3 = (TLObject) arrayList2.get(i17);
            if ((tLObject3 instanceof TLRPC.Chat) && !ChatObject.isNotInChat((TLRPC.Chat) tLObject3)) {
                arrayList2.remove(i17);
                i17--;
            }
            i17++;
        }
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f20734b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f20749t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f20734b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f20734b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f20734b, u1Var, (TLObject) arrayList2.get(i18)));
            }
            if (min < arrayList2.size()) {
                TLObject tLObject4 = null;
                if (min >= 0 && min < arrayList2.size()) {
                    tLObject = (TLObject) arrayList2.get(min);
                } else {
                    tLObject = null;
                }
                if (min >= 0 && (i12 = min + 1) < arrayList2.size()) {
                    tLObject2 = (TLObject) arrayList2.get(i12);
                } else {
                    tLObject2 = null;
                }
                if (min >= 0 && (i11 = min + 2) < arrayList2.size()) {
                    tLObject4 = (TLObject) arrayList2.get(i11);
                }
                arrayList.add(new n0(this.f20734b, u1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f20735c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            u01 u01Var = new u01(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            u01Var.f28658o = true;
            this.v = u01Var;
        }
        if (d()) {
            u1Var.f21512s0 = AndroidUtilities.dp(144.0f) + u1Var.f21512s0;
            this.f20740k.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19320ra, u1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f20743n);
        this.f20745p = size2;
        this.f20744o = Utilities.clamp(this.f20744o, size2, 0.0f);
    }
}
