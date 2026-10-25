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
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.xc;
public final class n0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final un0 E;
    public m0 F;
    public pa G;
    public final s1 f24496a;
    public int f24497b;
    public long f24498c;
    public MessageObject d;
    public long e;
    public StaticLayout f24500g;
    public float h;
    public float f24501i;
    public int f24502j;
    public float f24507o;
    public float f24508p;
    public da0 f24511s;
    public final org.telegram.ui.Components.h6 f24513u;
    public q11 v;
    public final xc f24516y;
    public final TextPaint f24499f = new TextPaint(1);
    public final Paint f24503k = new Paint(1);
    public final Path f24504l = new Path();
    public final float f24505m = -1.0f;
    public int f24506n = AndroidUtilities.dp(66.0f);
    public final ArrayList f24509q = new ArrayList();
    public final Path f24510r = new Path();
    public final RectF f24514w = new RectF();
    public final RectF f24515x = new RectF();
    public final Paint f24517z = new Paint(1);
    public boolean f24512t = true;

    public n0(s1 s1Var) {
        this.f24496a = s1Var;
        this.E = new un0(s1Var.getContext(), null);
        this.f24516y = new xc(s1Var);
        this.f24513u = new org.telegram.ui.Components.h6(s1Var, 350L, ds.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        un0 un0Var = this.E;
        if (un0Var.b()) {
            float f7 = un0Var.f33455j;
            this.f24507o = f7;
            this.f24507o = Utilities.clamp(f7, this.f24508p - (this.f24514w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f24496a.a3();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f24509q.size() > 0) {
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
        this.f24497b = messageObject.currentAccount;
        this.d = messageObject;
        this.f24498c = messageObject.getDialogId();
        MessagesController.getInstance(this.f24497b).getChat(Long.valueOf(-this.f24498c));
        this.e = -this.f24498c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f24499f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.y6.f23451ic;
        s1 s1Var = this.f24496a;
        textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(i13, s1Var.Id));
        this.f24500g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f24501i = 0.0f;
        for (int i14 = 0; i14 < this.f24500g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f24500g.getLineLeft(i14));
            this.f24501i = Math.max(this.f24501i, this.f24500g.getLineRight(i14));
        }
        this.f24502j = this.f24500g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f24517z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.W5, s1Var.Id));
        s1Var.f25267s0 = AndroidUtilities.dp(14.66f) + this.f24502j;
        int i15 = 0;
        while (true) {
            arrayList = this.f24509q;
            if (i15 >= arrayList.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = m0Var.f24406c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f24497b).getChannelRecommendations(this.f24498c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f24497b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f24512t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f24497b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f24497b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new m0(this.f24497b, s1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new m0(this.f24497b, s1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f24498c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            q11 q11Var = new q11(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            q11Var.f31797o = true;
            this.v = q11Var;
        }
        if (d()) {
            s1Var.f25267s0 = AndroidUtilities.dp(144.0f) + s1Var.f25267s0;
            this.f24503k.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23616ra, s1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f24506n);
        this.f24508p = size2;
        this.f24507o = Utilities.clamp(this.f24507o, size2, 0.0f);
    }
}
