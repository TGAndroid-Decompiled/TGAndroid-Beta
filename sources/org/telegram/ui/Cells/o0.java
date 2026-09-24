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
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zm0;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final zm0 E;
    public n0 F;
    public na G;
    public final u1 f20719a;
    public int f20720b;
    public long f20721c;
    public MessageObject d;
    public long e;
    public StaticLayout f20723g;
    public float h;
    public float f20724i;
    public int f20725j;
    public float f20730o;
    public float f20731p;
    public r90 f20734s;
    public final org.telegram.ui.Components.e6 f20736u;
    public t01 v;
    public final zc f20739y;
    public final TextPaint f20722f = new TextPaint(1);
    public final Paint f20726k = new Paint(1);
    public final Path f20727l = new Path();
    public final float f20728m = -1.0f;
    public int f20729n = AndroidUtilities.dp(66.0f);
    public final ArrayList f20732q = new ArrayList();
    public final Path f20733r = new Path();
    public final RectF f20737w = new RectF();
    public final RectF f20738x = new RectF();
    public final Paint f20740z = new Paint(1);
    public boolean f20735t = true;

    public o0(u1 u1Var) {
        this.f20719a = u1Var;
        this.E = new zm0(u1Var.getContext(), null);
        this.f20739y = new zc(u1Var);
        this.f20736u = new org.telegram.ui.Components.e6(u1Var, 350L, rr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        zm0 zm0Var = this.E;
        if (zm0Var.b()) {
            float f7 = zm0Var.f30932j;
            this.f20730o = f7;
            this.f20730o = Utilities.clamp(f7, this.f20731p - (this.f20737w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f20719a.a3();
        }
    }

    public final void c(android.graphics.Canvas r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f20732q.size() > 0) {
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
        this.f20720b = messageObject.currentAccount;
        this.d = messageObject;
        this.f20721c = messageObject.getDialogId();
        MessagesController.getInstance(this.f20720b).getChat(Long.valueOf(-this.f20721c));
        this.e = -this.f20721c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f20722f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.h6.f19140ic;
        u1 u1Var = this.f20719a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(i13, u1Var.Id));
        this.f20723g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f20724i = 0.0f;
        for (int i14 = 0; i14 < this.f20723g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f20723g.getLineLeft(i14));
            this.f20724i = Math.max(this.f20724i, this.f20723g.getLineRight(i14));
        }
        this.f20725j = this.f20723g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f20740z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.W5, u1Var.Id));
        u1Var.f21498s0 = AndroidUtilities.dp(14.66f) + this.f20725j;
        int i15 = 0;
        while (true) {
            arrayList = this.f20732q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f20651c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f20720b).getChannelRecommendations(this.f20721c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f20720b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f20735t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f20720b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f20720b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f20720b, u1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new n0(this.f20720b, u1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f20721c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            t01 t01Var = new t01(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            t01Var.f28366o = true;
            this.v = t01Var;
        }
        if (d()) {
            u1Var.f21498s0 = AndroidUtilities.dp(144.0f) + u1Var.f21498s0;
            this.f20726k.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19306ra, u1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f20729n);
        this.f20731p = size2;
        this.f20730o = Utilities.clamp(this.f20730o, size2, 0.0f);
    }
}
