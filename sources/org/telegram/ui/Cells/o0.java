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
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.zc;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final fn0 E;
    public n0 F;
    public na G;
    public final u1 f22575a;
    public int f22576b;
    public long f22577c;
    public MessageObject d;
    public long f22578e;
    public StaticLayout f22580g;
    public float h;
    public float f22581i;
    public int f22582j;
    public float f22587o;
    public float f22588p;
    public u90 f22591s;
    public final org.telegram.ui.Components.e6 f22593u;
    public f11 v;
    public final zc f22596y;
    public final TextPaint f22579f = new TextPaint(1);
    public final Paint f22583k = new Paint(1);
    public final Path f22584l = new Path();
    public final float f22585m = -1.0f;
    public int f22586n = AndroidUtilities.dp(66.0f);
    public final ArrayList f22589q = new ArrayList();
    public final Path f22590r = new Path();
    public final RectF f22594w = new RectF();
    public final RectF f22595x = new RectF();
    public final Paint f22597z = new Paint(1);
    public boolean f22592t = true;

    public o0(u1 u1Var) {
        this.f22575a = u1Var;
        this.E = new fn0(u1Var.getContext(), null);
        this.f22596y = new zc(u1Var);
        this.f22593u = new org.telegram.ui.Components.e6(u1Var, 350L, tr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        fn0 fn0Var = this.E;
        if (fn0Var.b()) {
            float f7 = fn0Var.f26538j;
            this.f22587o = f7;
            this.f22587o = Utilities.clamp(f7, this.f22588p - (this.f22594w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f22575a.a3();
        }
    }

    public final void c(android.graphics.Canvas r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f22589q.size() > 0) {
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
        this.f22576b = messageObject.currentAccount;
        this.d = messageObject;
        this.f22577c = messageObject.getDialogId();
        MessagesController.getInstance(this.f22576b).getChat(Long.valueOf(-this.f22577c));
        this.f22578e = -this.f22577c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f22579f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.i6.f20924ic;
        u1 u1Var = this.f22575a;
        textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(i13, u1Var.Id));
        this.f22580g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f22581i = 0.0f;
        for (int i14 = 0; i14 < this.f22580g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f22580g.getLineLeft(i14));
            this.f22581i = Math.max(this.f22581i, this.f22580g.getLineRight(i14));
        }
        this.f22582j = this.f22580g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f22597z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.W5, u1Var.Id));
        u1Var.f23382s0 = AndroidUtilities.dp(14.66f) + this.f22582j;
        int i15 = 0;
        while (true) {
            arrayList = this.f22589q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f22502c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f22576b).getChannelRecommendations(this.f22577c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f22576b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f22592t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f22576b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f22576b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f22576b, u1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new n0(this.f22576b, u1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f22577c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            f11 f11Var = new f11(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            f11Var.f26276o = true;
            this.v = f11Var;
        }
        if (d()) {
            u1Var.f23382s0 = AndroidUtilities.dp(144.0f) + u1Var.f23382s0;
            this.f22583k.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21091ra, u1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f22586n);
        this.f22588p = size2;
        this.f22587o = Utilities.clamp(this.f22587o, size2, 0.0f);
    }
}
