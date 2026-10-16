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
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.pn0;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final pn0 E;
    public n0 F;
    public la G;
    public final u1 f21310a;
    public int f21311b;
    public long f21312c;
    public MessageObject d;
    public long e;
    public StaticLayout f21314g;
    public float h;
    public float f21315i;
    public int f21316j;
    public float f21321o;
    public float f21322p;
    public ha0 f21325s;
    public final org.telegram.ui.Components.g6 f21327u;
    public i11 v;
    public final ad f21330y;
    public final TextPaint f21313f = new TextPaint(1);
    public final Paint f21317k = new Paint(1);
    public final Path f21318l = new Path();
    public final float f21319m = -1.0f;
    public int f21320n = AndroidUtilities.dp(66.0f);
    public final ArrayList f21323q = new ArrayList();
    public final Path f21324r = new Path();
    public final RectF f21328w = new RectF();
    public final RectF f21329x = new RectF();
    public final Paint f21331z = new Paint(1);
    public boolean f21326t = true;

    public o0(u1 u1Var) {
        this.f21310a = u1Var;
        this.E = new pn0(u1Var.getContext(), null);
        this.f21330y = new ad(u1Var);
        this.f21327u = new org.telegram.ui.Components.g6(u1Var, 350L, es.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        pn0 pn0Var = this.E;
        if (pn0Var.b()) {
            float f7 = pn0Var.f28070j;
            this.f21321o = f7;
            this.f21321o = Utilities.clamp(f7, this.f21322p - (this.f21328w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f21310a.a3();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f21323q.size() > 0) {
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
        this.f21311b = messageObject.currentAccount;
        this.d = messageObject;
        this.f21312c = messageObject.getDialogId();
        MessagesController.getInstance(this.f21311b).getChat(Long.valueOf(-this.f21312c));
        this.e = -this.f21312c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f21313f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.g6.f19695ic;
        u1 u1Var = this.f21310a;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(i13, u1Var.Id));
        this.f21314g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f21315i = 0.0f;
        for (int i14 = 0; i14 < this.f21314g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f21314g.getLineLeft(i14));
            this.f21315i = Math.max(this.f21315i, this.f21314g.getLineRight(i14));
        }
        this.f21316j = this.f21314g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f21331z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.W5, u1Var.Id));
        u1Var.f22101s0 = AndroidUtilities.dp(14.66f) + this.f21316j;
        int i15 = 0;
        while (true) {
            arrayList = this.f21323q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f21240c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f21311b).getChannelRecommendations(this.f21312c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f21311b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f21326t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f21311b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f21311b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f21311b, u1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new n0(this.f21311b, u1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f21312c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            i11 i11Var = new i11(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            i11Var.f25464o = true;
            this.v = i11Var;
        }
        if (d()) {
            u1Var.f22101s0 = AndroidUtilities.dp(144.0f) + u1Var.f22101s0;
            this.f21317k.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19862ra, u1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f21320n);
        this.f21322p = size2;
        this.f21321o = Utilities.clamp(this.f21321o, size2, 0.0f);
    }
}
