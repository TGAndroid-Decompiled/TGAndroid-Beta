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
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xm0;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final xm0 E;
    public n0 F;
    public pa G;
    public final t1 f19590a;
    public int f19591b;
    public long f19592c;
    public MessageObject d;
    public long e;
    public StaticLayout f19594g;
    public float h;
    public float f19595i;
    public int f19596j;
    public float f19601o;
    public float f19602p;
    public q90 f19605s;
    public final org.telegram.ui.Components.d6 f19607u;
    public t01 v;
    public final xc f19610y;
    public final TextPaint f19593f = new TextPaint(1);
    public final Paint f19597k = new Paint(1);
    public final Path f19598l = new Path();
    public final float f19599m = -1.0f;
    public int f19600n = AndroidUtilities.dp(66.0f);
    public final ArrayList f19603q = new ArrayList();
    public final Path f19604r = new Path();
    public final RectF f19608w = new RectF();
    public final RectF f19609x = new RectF();
    public final Paint f19611z = new Paint(1);
    public boolean f19606t = true;

    public o0(t1 t1Var) {
        this.f19590a = t1Var;
        this.E = new xm0(t1Var.getContext(), null);
        this.f19610y = new xc(t1Var);
        this.f19607u = new org.telegram.ui.Components.d6(t1Var, 350L, wr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        xm0 xm0Var = this.E;
        if (xm0Var.b()) {
            float f7 = xm0Var.f29095j;
            this.f19601o = f7;
            this.f19601o = Utilities.clamp(f7, this.f19602p - (this.f19608w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f19590a.a3();
        }
    }

    public final void c(android.graphics.Canvas r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f19603q.size() > 0) {
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
        this.f19591b = messageObject.currentAccount;
        this.d = messageObject;
        this.f19592c = messageObject.getDialogId();
        MessagesController.getInstance(this.f19591b).getChat(Long.valueOf(-this.f19592c));
        this.e = -this.f19592c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f19593f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.j6.f18023ic;
        t1 t1Var = this.f19590a;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i13, t1Var.Id));
        this.f19594g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f19595i = 0.0f;
        for (int i14 = 0; i14 < this.f19594g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f19594g.getLineLeft(i14));
            this.f19595i = Math.max(this.f19595i, this.f19594g.getLineRight(i14));
        }
        this.f19596j = this.f19594g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f19611z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, t1Var.Id));
        t1Var.f20308s0 = AndroidUtilities.dp(14.66f) + this.f19596j;
        int i15 = 0;
        while (true) {
            arrayList = this.f19603q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f19545c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f19591b).getChannelRecommendations(this.f19592c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f19591b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f19606t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f19591b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f19591b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f19591b, t1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new n0(this.f19591b, t1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f19592c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            t01 t01Var = new t01(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            t01Var.f27256o = true;
            this.v = t01Var;
        }
        if (d()) {
            t1Var.f20308s0 = AndroidUtilities.dp(144.0f) + t1Var.f20308s0;
            this.f19597k.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18184ra, t1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f19600n);
        this.f19602p = size2;
        this.f19601o = Utilities.clamp(this.f19601o, size2, 0.0f);
    }
}
