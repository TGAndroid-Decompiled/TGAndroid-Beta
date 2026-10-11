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
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.un0;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final un0 E;
    public n0 F;
    public la G;
    public final u1 f22590a;
    public int f22591b;
    public long f22592c;
    public MessageObject d;
    public long f22593e;
    public StaticLayout f22595g;
    public float h;
    public float f22596i;
    public int f22597j;
    public float f22602o;
    public float f22603p;
    public ia0 f22606s;
    public final org.telegram.ui.Components.g6 f22608u;
    public m11 v;
    public final bd f22611y;
    public final TextPaint f22594f = new TextPaint(1);
    public final Paint f22598k = new Paint(1);
    public final Path f22599l = new Path();
    public final float f22600m = -1.0f;
    public int f22601n = AndroidUtilities.dp(66.0f);
    public final ArrayList f22604q = new ArrayList();
    public final Path f22605r = new Path();
    public final RectF f22609w = new RectF();
    public final RectF f22610x = new RectF();
    public final Paint f22612z = new Paint(1);
    public boolean f22607t = true;

    public o0(u1 u1Var) {
        this.f22590a = u1Var;
        this.E = new un0(u1Var.getContext(), null);
        this.f22611y = new bd(u1Var);
        this.f22608u = new org.telegram.ui.Components.g6(u1Var, 350L, is.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        un0 un0Var = this.E;
        if (un0Var.b()) {
            float f7 = un0Var.f31656j;
            this.f22602o = f7;
            this.f22602o = Utilities.clamp(f7, this.f22603p - (this.f22609w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f22590a.a3();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f22604q.size() > 0) {
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
        this.f22591b = messageObject.currentAccount;
        this.d = messageObject;
        this.f22592c = messageObject.getDialogId();
        MessagesController.getInstance(this.f22591b).getChat(Long.valueOf(-this.f22592c));
        this.f22593e = -this.f22592c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f22594f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.h6.f20919ic;
        u1 u1Var = this.f22590a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(i13, u1Var.Id));
        this.f22595g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f22596i = 0.0f;
        for (int i14 = 0; i14 < this.f22595g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f22595g.getLineLeft(i14));
            this.f22596i = Math.max(this.f22596i, this.f22595g.getLineRight(i14));
        }
        this.f22597j = this.f22595g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f22612z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.W5, u1Var.Id));
        u1Var.f23390s0 = AndroidUtilities.dp(14.66f) + this.f22597j;
        int i15 = 0;
        while (true) {
            arrayList = this.f22604q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f22515c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f22591b).getChannelRecommendations(this.f22592c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f22591b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f22607t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f22591b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f22591b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f22591b, u1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new n0(this.f22591b, u1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f22592c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            m11 m11Var = new m11(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            m11Var.f28688o = true;
            this.v = m11Var;
        }
        if (d()) {
            u1Var.f23390s0 = AndroidUtilities.dp(144.0f) + u1Var.f23390s0;
            this.f22598k.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21085ra, u1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f22601n);
        this.f22603p = size2;
        this.f22602o = Utilities.clamp(this.f22602o, size2, 0.0f);
    }
}
