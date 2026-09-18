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
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.yc;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final an0 E;
    public n0 F;
    public na G;
    public final u1 f20697a;
    public int f20698b;
    public long f20699c;
    public MessageObject d;
    public long e;
    public StaticLayout f20701g;
    public float h;
    public float f20702i;
    public int f20703j;
    public float f20708o;
    public float f20709p;
    public p90 f20712s;
    public final org.telegram.ui.Components.e6 f20714u;
    public v01 v;
    public final yc f20717y;
    public final TextPaint f20700f = new TextPaint(1);
    public final Paint f20704k = new Paint(1);
    public final Path f20705l = new Path();
    public final float f20706m = -1.0f;
    public int f20707n = AndroidUtilities.dp(66.0f);
    public final ArrayList f20710q = new ArrayList();
    public final Path f20711r = new Path();
    public final RectF f20715w = new RectF();
    public final RectF f20716x = new RectF();
    public final Paint f20718z = new Paint(1);
    public boolean f20713t = true;

    public o0(u1 u1Var) {
        this.f20697a = u1Var;
        this.E = new an0(u1Var.getContext(), null);
        this.f20717y = new yc(u1Var);
        this.f20714u = new org.telegram.ui.Components.e6(u1Var, 350L, qr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        an0 an0Var = this.E;
        if (an0Var.b()) {
            float f7 = an0Var.f22671j;
            this.f20708o = f7;
            this.f20708o = Utilities.clamp(f7, this.f20709p - (this.f20715w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f20697a.a3();
        }
    }

    public final void c(android.graphics.Canvas r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f20710q.size() > 0) {
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
        this.f20698b = messageObject.currentAccount;
        this.d = messageObject;
        this.f20699c = messageObject.getDialogId();
        MessagesController.getInstance(this.f20698b).getChat(Long.valueOf(-this.f20699c));
        this.e = -this.f20699c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f20700f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.j6.f19158ic;
        u1 u1Var = this.f20697a;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i13, u1Var.Id));
        this.f20701g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f20702i = 0.0f;
        for (int i14 = 0; i14 < this.f20701g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f20701g.getLineLeft(i14));
            this.f20702i = Math.max(this.f20702i, this.f20701g.getLineRight(i14));
        }
        this.f20703j = this.f20701g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f20718z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, u1Var.Id));
        u1Var.f21477s0 = AndroidUtilities.dp(14.66f) + this.f20703j;
        int i15 = 0;
        while (true) {
            arrayList = this.f20710q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f20629c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f20698b).getChannelRecommendations(this.f20699c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f20698b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f20713t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f20698b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f20698b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f20698b, u1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new n0(this.f20698b, u1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f20699c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            v01 v01Var = new v01(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            v01Var.f28877o = true;
            this.v = v01Var;
        }
        if (d()) {
            u1Var.f21477s0 = AndroidUtilities.dp(144.0f) + u1Var.f21477s0;
            this.f20704k.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19323ra, u1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f20707n);
        this.f20709p = size2;
        this.f20708o = Utilities.clamp(this.f20708o, size2, 0.0f);
    }
}
