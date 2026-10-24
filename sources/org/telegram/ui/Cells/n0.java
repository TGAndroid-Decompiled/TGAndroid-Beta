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
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.zr;
public final class n0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final on0 E;
    public m0 F;
    public la G;
    public final t1 f22745a;
    public int f22746b;
    public long f22747c;
    public MessageObject d;
    public long e;
    public StaticLayout f22749g;
    public float h;
    public float f22750i;
    public int f22751j;
    public float f22756o;
    public float f22757p;
    public aa0 f22760s;
    public final org.telegram.ui.Components.d6 f22762u;
    public h11 v;
    public final wc f22765y;
    public final TextPaint f22748f = new TextPaint(1);
    public final Paint f22752k = new Paint(1);
    public final Path f22753l = new Path();
    public final float f22754m = -1.0f;
    public int f22755n = AndroidUtilities.dp(66.0f);
    public final ArrayList f22758q = new ArrayList();
    public final Path f22759r = new Path();
    public final RectF f22763w = new RectF();
    public final RectF f22764x = new RectF();
    public final Paint f22766z = new Paint(1);
    public boolean f22761t = true;

    public n0(t1 t1Var) {
        this.f22745a = t1Var;
        this.E = new on0(t1Var.getContext(), null);
        this.f22765y = new wc(t1Var);
        this.f22762u = new org.telegram.ui.Components.d6(t1Var, 350L, zr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        on0 on0Var = this.E;
        if (on0Var.b()) {
            float f7 = on0Var.f29339j;
            this.f22756o = f7;
            this.f22756o = Utilities.clamp(f7, this.f22757p - (this.f22763w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f22745a.Z2();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f22758q.size() > 0) {
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
        this.f22746b = messageObject.currentAccount;
        this.d = messageObject;
        this.f22747c = messageObject.getDialogId();
        MessagesController.getInstance(this.f22746b).getChat(Long.valueOf(-this.f22747c));
        this.e = -this.f22747c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f22748f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.k6.f21278ic;
        t1 t1Var = this.f22745a;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i13, t1Var.Id));
        this.f22749g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f22750i = 0.0f;
        for (int i14 = 0; i14 < this.f22749g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f22749g.getLineLeft(i14));
            this.f22750i = Math.max(this.f22750i, this.f22749g.getLineRight(i14));
        }
        this.f22751j = this.f22749g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f22766z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W5, t1Var.Id));
        t1Var.f23564s0 = AndroidUtilities.dp(14.66f) + this.f22751j;
        int i15 = 0;
        while (true) {
            arrayList = this.f22758q;
            if (i15 >= arrayList.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = m0Var.f22706c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f22746b).getChannelRecommendations(this.f22747c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f22746b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f22761t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f22746b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f22746b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new m0(this.f22746b, t1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new m0(this.f22746b, t1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f22747c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            h11 h11Var = new h11(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            h11Var.f26852o = true;
            this.v = h11Var;
        }
        if (d()) {
            t1Var.f23564s0 = AndroidUtilities.dp(144.0f) + t1Var.f23564s0;
            this.f22752k.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21445ra, t1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f22755n);
        this.f22757p = size2;
        this.f22756o = Utilities.clamp(this.f22756o, size2, 0.0f);
    }
}
