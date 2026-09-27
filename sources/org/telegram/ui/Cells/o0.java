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
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.yc;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final bn0 E;
    public n0 F;
    public na G;
    public final u1 f20735a;
    public int f20736b;
    public long f20737c;
    public MessageObject d;
    public long e;
    public StaticLayout f20739g;
    public float h;
    public float f20740i;
    public int f20741j;
    public float f20746o;
    public float f20747p;
    public t90 f20750s;
    public final org.telegram.ui.Components.e6 f20752u;
    public v01 v;
    public final yc f20755y;
    public final TextPaint f20738f = new TextPaint(1);
    public final Paint f20742k = new Paint(1);
    public final Path f20743l = new Path();
    public final float f20744m = -1.0f;
    public int f20745n = AndroidUtilities.dp(66.0f);
    public final ArrayList f20748q = new ArrayList();
    public final Path f20749r = new Path();
    public final RectF f20753w = new RectF();
    public final RectF f20754x = new RectF();
    public final Paint f20756z = new Paint(1);
    public boolean f20751t = true;

    public o0(u1 u1Var) {
        this.f20735a = u1Var;
        this.E = new bn0(u1Var.getContext(), null);
        this.f20755y = new yc(u1Var);
        this.f20752u = new org.telegram.ui.Components.e6(u1Var, 350L, sr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        bn0 bn0Var = this.E;
        if (bn0Var.b()) {
            float f7 = bn0Var.f23086j;
            this.f20746o = f7;
            this.f20746o = Utilities.clamp(f7, this.f20747p - (this.f20753w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f20735a.a3();
        }
    }

    public final void c(android.graphics.Canvas r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f20748q.size() > 0) {
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
        this.f20736b = messageObject.currentAccount;
        this.d = messageObject;
        this.f20737c = messageObject.getDialogId();
        MessagesController.getInstance(this.f20736b).getChat(Long.valueOf(-this.f20737c));
        this.e = -this.f20737c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f20738f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.i6.f19153ic;
        u1 u1Var = this.f20735a;
        textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(i13, u1Var.Id));
        this.f20739g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f20740i = 0.0f;
        for (int i14 = 0; i14 < this.f20739g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f20739g.getLineLeft(i14));
            this.f20740i = Math.max(this.f20740i, this.f20739g.getLineRight(i14));
        }
        this.f20741j = this.f20739g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f20756z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.W5, u1Var.Id));
        u1Var.f21515s0 = AndroidUtilities.dp(14.66f) + this.f20741j;
        int i15 = 0;
        while (true) {
            arrayList = this.f20748q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f20667c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f20736b).getChannelRecommendations(this.f20737c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f20736b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f20751t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f20736b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f20736b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f20736b, u1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new n0(this.f20736b, u1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f20737c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            v01 v01Var = new v01(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            v01Var.f28996o = true;
            this.v = v01Var;
        }
        if (d()) {
            u1Var.f21515s0 = AndroidUtilities.dp(144.0f) + u1Var.f21515s0;
            this.f20742k.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19320ra, u1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f20745n);
        this.f20747p = size2;
        this.f20746o = Utilities.clamp(this.f20746o, size2, 0.0f);
    }
}
