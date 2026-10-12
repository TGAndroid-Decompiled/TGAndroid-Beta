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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.pn0;
public final class p0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final pn0 E;
    public o0 F;
    public la G;
    public final u1 f21649a;
    public int f21650b;
    public long f21651c;
    public MessageObject d;
    public long e;
    public StaticLayout f21653g;
    public float h;
    public float f21654i;
    public int f21655j;
    public float f21660o;
    public float f21661p;
    public ha0 f21664s;
    public final org.telegram.ui.Components.g6 f21666u;
    public h11 v;
    public final ad f21669y;
    public final TextPaint f21652f = new TextPaint(1);
    public final Paint f21656k = new Paint(1);
    public final Path f21657l = new Path();
    public final float f21658m = -1.0f;
    public int f21659n = AndroidUtilities.dp(66.0f);
    public final ArrayList f21662q = new ArrayList();
    public final Path f21663r = new Path();
    public final RectF f21667w = new RectF();
    public final RectF f21668x = new RectF();
    public final Paint f21670z = new Paint(1);
    public boolean f21665t = true;

    public p0(u1 u1Var) {
        this.f21649a = u1Var;
        this.E = new pn0(u1Var.getContext(), null);
        this.f21669y = new ad(u1Var);
        this.f21666u = new org.telegram.ui.Components.g6(u1Var, 350L, es.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        pn0 pn0Var = this.E;
        if (pn0Var.b()) {
            float f7 = pn0Var.f28381j;
            this.f21660o = f7;
            this.f21660o = Utilities.clamp(f7, this.f21661p - (this.f21667w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f21649a.a3();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f21662q.size() > 0) {
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
        this.f21650b = messageObject.currentAccount;
        this.d = messageObject;
        this.f21651c = messageObject.getDialogId();
        MessagesController.getInstance(this.f21650b).getChat(Long.valueOf(-this.f21651c));
        this.e = -this.f21651c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f21652f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.g6.f19995ic;
        u1 u1Var = this.f21649a;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(i13, u1Var.Id));
        this.f21653g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f21654i = 0.0f;
        for (int i14 = 0; i14 < this.f21653g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f21653g.getLineLeft(i14));
            this.f21654i = Math.max(this.f21654i, this.f21653g.getLineRight(i14));
        }
        this.f21655j = this.f21653g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f21670z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.W5, u1Var.Id));
        u1Var.f22392s0 = AndroidUtilities.dp(14.66f) + this.f21655j;
        int i15 = 0;
        while (true) {
            arrayList = this.f21662q;
            if (i15 >= arrayList.size()) {
                break;
            }
            o0 o0Var = (o0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = o0Var.f21605c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f21650b).getChannelRecommendations(this.f21651c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f21650b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f21665t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f21650b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f21650b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new o0(this.f21650b, u1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new o0(this.f21650b, u1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f21651c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            h11 h11Var = new h11(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            h11Var.f25482o = true;
            this.v = h11Var;
        }
        if (d()) {
            u1Var.f22392s0 = AndroidUtilities.dp(144.0f) + u1Var.f22392s0;
            this.f21656k.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20162ra, u1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f21659n);
        this.f21661p = size2;
        this.f21660o = Utilities.clamp(this.f21660o, size2, 0.0f);
    }
}
