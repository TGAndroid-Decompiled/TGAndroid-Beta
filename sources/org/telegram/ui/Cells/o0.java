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
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.n11;
import org.telegram.ui.Components.vn0;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final vn0 E;
    public n0 F;
    public la G;
    public final u1 f22554a;
    public int f22555b;
    public long f22556c;
    public MessageObject d;
    public long f22557e;
    public StaticLayout f22559g;
    public float h;
    public float f22560i;
    public int f22561j;
    public float f22566o;
    public float f22567p;
    public ja0 f22570s;
    public final org.telegram.ui.Components.g6 f22572u;
    public n11 v;
    public final bd f22575y;
    public final TextPaint f22558f = new TextPaint(1);
    public final Paint f22562k = new Paint(1);
    public final Path f22563l = new Path();
    public final float f22564m = -1.0f;
    public int f22565n = AndroidUtilities.dp(66.0f);
    public final ArrayList f22568q = new ArrayList();
    public final Path f22569r = new Path();
    public final RectF f22573w = new RectF();
    public final RectF f22574x = new RectF();
    public final Paint f22576z = new Paint(1);
    public boolean f22571t = true;

    public o0(u1 u1Var) {
        this.f22554a = u1Var;
        this.E = new vn0(u1Var.getContext(), null);
        this.f22575y = new bd(u1Var);
        this.f22572u = new org.telegram.ui.Components.g6(u1Var, 350L, is.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        vn0 vn0Var = this.E;
        if (vn0Var.b()) {
            float f7 = vn0Var.f31863j;
            this.f22566o = f7;
            this.f22566o = Utilities.clamp(f7, this.f22567p - (this.f22573w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f22554a.a3();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f22568q.size() > 0) {
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
        this.f22555b = messageObject.currentAccount;
        this.d = messageObject;
        this.f22556c = messageObject.getDialogId();
        MessagesController.getInstance(this.f22555b).getChat(Long.valueOf(-this.f22556c));
        this.f22557e = -this.f22556c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f22558f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.h6.f20883ic;
        u1 u1Var = this.f22554a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(i13, u1Var.Id));
        this.f22559g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f22560i = 0.0f;
        for (int i14 = 0; i14 < this.f22559g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f22559g.getLineLeft(i14));
            this.f22560i = Math.max(this.f22560i, this.f22559g.getLineRight(i14));
        }
        this.f22561j = this.f22559g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f22576z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.W5, u1Var.Id));
        u1Var.f23354s0 = AndroidUtilities.dp(14.66f) + this.f22561j;
        int i15 = 0;
        while (true) {
            arrayList = this.f22568q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f22479c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f22555b).getChannelRecommendations(this.f22556c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f22555b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f22571t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f22555b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f22555b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f22555b, u1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new n0(this.f22555b, u1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f22556c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            n11 n11Var = new n11(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            n11Var.f28912o = true;
            this.v = n11Var;
        }
        if (d()) {
            u1Var.f23354s0 = AndroidUtilities.dp(144.0f) + u1Var.f23354s0;
            this.f22562k.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21049ra, u1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f22565n);
        this.f22567p = size2;
        this.f22566o = Utilities.clamp(this.f22566o, size2, 0.0f);
    }
}
