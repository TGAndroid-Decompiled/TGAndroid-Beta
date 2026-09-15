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
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.wc;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final nm0 E;
    public n0 F;
    public oa G;
    public final t1 f20512a;
    public int f20513b;
    public long f20514c;
    public MessageObject d;
    public long e;
    public StaticLayout f20516g;
    public float h;
    public float f20517i;
    public int f20518j;
    public float f20523o;
    public float f20524p;
    public g90 f20527s;
    public final org.telegram.ui.Components.c6 f20529u;
    public g01 v;
    public final wc f20532y;
    public final TextPaint f20515f = new TextPaint(1);
    public final Paint f20519k = new Paint(1);
    public final Path f20520l = new Path();
    public final float f20521m = -1.0f;
    public int f20522n = AndroidUtilities.dp(66.0f);
    public final ArrayList f20525q = new ArrayList();
    public final Path f20526r = new Path();
    public final RectF f20530w = new RectF();
    public final RectF f20531x = new RectF();
    public final Paint f20533z = new Paint(1);
    public boolean f20528t = true;

    public o0(t1 t1Var) {
        this.f20512a = t1Var;
        this.E = new nm0(t1Var.getContext(), null);
        this.f20532y = new wc(t1Var);
        this.f20529u = new org.telegram.ui.Components.c6(t1Var, 350L, qr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        nm0 nm0Var = this.E;
        if (nm0Var.b()) {
            float f7 = nm0Var.f26529j;
            this.f20523o = f7;
            this.f20523o = Utilities.clamp(f7, this.f20524p - (this.f20530w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f20512a.a3();
        }
    }

    public final void c(android.graphics.Canvas r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f20525q.size() > 0) {
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
        this.f20513b = messageObject.currentAccount;
        this.d = messageObject;
        this.f20514c = messageObject.getDialogId();
        MessagesController.getInstance(this.f20513b).getChat(Long.valueOf(-this.f20514c));
        this.e = -this.f20514c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f20515f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.i6.f18932ic;
        t1 t1Var = this.f20512a;
        textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(i13, t1Var.Id));
        this.f20516g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f20517i = 0.0f;
        for (int i14 = 0; i14 < this.f20516g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f20516g.getLineLeft(i14));
            this.f20517i = Math.max(this.f20517i, this.f20516g.getLineRight(i14));
        }
        this.f20518j = this.f20516g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f20533z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.W5, t1Var.Id));
        t1Var.f21227s0 = AndroidUtilities.dp(14.66f) + this.f20518j;
        int i15 = 0;
        while (true) {
            arrayList = this.f20525q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f20455c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f20513b).getChannelRecommendations(this.f20514c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f20513b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f20528t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f20513b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f20513b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f20513b, t1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new n0(this.f20513b, t1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f20514c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            g01 g01Var = new g01(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            g01Var.f24158o = true;
            this.v = g01Var;
        }
        if (d()) {
            t1Var.f21227s0 = AndroidUtilities.dp(144.0f) + t1Var.f21227s0;
            this.f20519k.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19096ra, t1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f20522n);
        this.f20524p = size2;
        this.f20523o = Utilities.clamp(this.f20523o, size2, 0.0f);
    }
}
