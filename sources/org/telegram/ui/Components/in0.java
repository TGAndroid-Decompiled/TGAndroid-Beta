package org.telegram.ui.Components;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class in0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final Activity F;
    public final org.telegram.ui.ActionBar.n2 G;
    public boolean H;
    public org.telegram.ui.w10 I;
    public final org.telegram.ui.p10 J;
    public String K;
    public String L;
    public an0 M;
    public final al0 N;
    public boolean O;
    public boolean P;
    public final jx0 f25086a;
    public final ai.w0 f25087b;
    public final hn0 f25088c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f25089f;
    public final ArrayList h;
    public final ArrayList f25090n;
    public int f25091r;
    public int f25092s;
    public int v;
    public int f25093w;
    public int f25094x;
    public int f25095y;

    public in0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getParentActivity());
        hn0 hn0Var = new hn0(this);
        this.f25088c = hn0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f25089f = new ArrayList();
        this.h = new ArrayList();
        this.f25090n = new ArrayList();
        this.f25092s = -1;
        this.v = -1;
        this.f25093w = -1;
        this.f25094x = -1;
        this.f25095y = -1;
        this.E = -1;
        this.J = new org.telegram.ui.p10(0, 0L);
        this.G = n2Var;
        this.F = n2Var.getParentActivity();
        this.d = i10;
        ai.w0 w0Var = new ai.w0(this, getContext(), 19);
        this.f25087b = w0Var;
        new s4.y(new bi.g(this, 3)).e(w0Var);
        addView(w0Var);
        n2Var.getParentActivity();
        w0Var.setLayoutManager(new gg.b0(10));
        w0Var.setAdapter(hn0Var);
        w0Var.setOnScrollListener(new sb0(this, 5));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f43009m = false;
        w0Var.setItemAnimator(jVar);
        w0Var.setOnItemClickListener(new bn0(this, i10, 0));
        w0Var.setOnItemLongClickListener(new mv(this, 17));
        this.N = new al0(w0Var, true);
        t00 t00Var = new t00(getContext(), null);
        addView(t00Var);
        t00Var.setUseHeaderOffset(true);
        t00Var.setViewType(3);
        t00Var.setVisibility(8);
        jx0 jx0Var = new jx0(getContext(), t00Var, 1, null);
        this.f25086a = jx0Var;
        addView(jx0Var);
        w0Var.setEmptyView(jx0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        ai.w0 w0Var;
        MessageObject message;
        int i10 = this.d;
        if (!UserConfig.getInstance(i10).isPremium() && (w0Var = this.f25087b) != null) {
            for (int i11 = 0; i11 < w0Var.getChildCount(); i11++) {
                try {
                    View childAt = w0Var.getChildAt(i11);
                    if ((childAt instanceof en0) && (message = ((en0) childAt).f23884a.getMessage()) != null) {
                        if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(false);
                        } else if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(true);
                        } else {
                            continue;
                        }
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void b(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.P = z10;
        setPadding(0, i10, 0, i11);
        ai.w0 w0Var = this.f25087b;
        if (z10) {
            w0Var.p1(0, i10, 0, i11);
        } else {
            w0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) w0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.P = false;
    }

    public final void c(boolean z10) {
        float f7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.n2 n2Var = this.G;
        if (n2Var != null && this.f25087b.G) {
            long currentTimeMillis = System.currentTimeMillis();
            int i12 = this.d;
            if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= MessagesController.getInstance(i12).uploadPremiumSpeedupNotifyPeriod * 1000) {
                ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
                if (!UserConfig.getInstance(i12).isPremium() && !MessagesController.getInstance(i12).premiumFeaturesBlocked()) {
                    if (z10) {
                        f7 = MessagesController.getInstance(i12).uploadPremiumSpeedupUpload;
                    } else {
                        f7 = MessagesController.getInstance(i12).uploadPremiumSpeedupDownload;
                    }
                    SpannableString spannableString = new SpannableString(Double.toString(Math.round(f7 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                    spannableString.setSpan(new t51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    if (!n2Var.hasStoryViewer()) {
                        xc a02 = xc.a0(n2Var);
                        int i13 = R.raw.speed_limit;
                        if (z10) {
                            i10 = R.string.UploadSpeedLimited;
                        } else {
                            i10 = R.string.DownloadSpeedLimited;
                        }
                        String string = LocaleController.getString(i10);
                        if (z10) {
                            i11 = R.string.UploadSpeedLimitedMessage;
                        } else {
                            i11 = R.string.DownloadSpeedLimitedMessage;
                        }
                        pc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new bi.f(27, this, z10)), spannableString), i13);
                        M.f27252j = 8000;
                        M.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j3;
        hn0 hn0Var = this.f25088c;
        hn0Var.q(0, hn0Var.f24726c.f25091r);
        if (!TextUtils.isEmpty(this.K)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
                this.f25086a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.K.toLowerCase();
                boolean equals = lowerCase.equals(this.L);
                this.L = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.M);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                an0 an0Var = new an0(this, arrayList, lowerCase, arrayList2);
                this.M = an0Var;
                if (equals) {
                    j3 = 0;
                } else {
                    j3 = 300;
                }
                dispatchQueue.postRunnable(an0Var, j3);
                this.f25090n.clear();
                this.h.clear();
                if (!equals) {
                    this.f25086a.e(true, true);
                    e(this.h, this.f25090n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f25091r == 0) {
            this.N.b(0);
        }
        if (this.O) {
            this.h.clear();
            this.f25090n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.f25090n);
        for (int i11 = 0; i11 < this.e.size(); i11++) {
            ((MessageObject) this.e.get(i11)).setQuery(null);
        }
        for (int i12 = 0; i12 < this.f25089f.size(); i12++) {
            ((MessageObject) this.f25089f.get(i12)).setQuery(null);
        }
        this.L = null;
        e(this.h, this.f25090n, z10);
        if (this.f25091r == 0) {
            this.f25086a.e(false, false);
            this.f25086a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.f25086a.e.setVisibility(8);
        }
        this.f25086a.setStickerType(9);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.onDownloadingFilesChanged) {
            if (getVisibility() == 0) {
                DownloadController.getInstance(this.d).clearUnviewedDownloads();
            }
            d(true);
        } else if (i10 == NotificationCenter.premiumFloodWaitReceived) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        s4.c1 U;
        hn0 hn0Var = this.f25088c;
        if (z10) {
            int i10 = this.f25092s;
            int i11 = this.v;
            int i12 = this.f25093w;
            int i13 = this.f25094x;
            int i14 = this.f25095y;
            int i15 = this.E;
            int i16 = this.f25091r;
            ArrayList arrayList3 = new ArrayList(this.e);
            ArrayList arrayList4 = new ArrayList(this.f25089f);
            f(arrayList, arrayList2);
            s4.o.c(new dn0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).b(hn0Var);
            int i17 = 0;
            while (true) {
                ai.w0 w0Var = this.f25087b;
                if (i17 < w0Var.getChildCount()) {
                    View childAt = w0Var.getChildAt(i17);
                    int S = RecyclerView.S(childAt);
                    if (S >= 0 && (U = w0Var.U(childAt)) != null && !U.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.w3) {
                            hn0Var.v(U, S);
                        } else if (childAt instanceof en0) {
                            org.telegram.ui.Cells.l7 l7Var = ((en0) childAt).f23884a;
                            l7Var.f(true);
                            int id2 = l7Var.getMessage().getId();
                            long dialogId = l7Var.getMessage().getDialogId();
                            org.telegram.ui.p10 p10Var = this.J;
                            p10Var.f36423a = dialogId;
                            p10Var.f36424b = id2;
                            l7Var.b(this.I.c(p10Var), true);
                        }
                    }
                    i17++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            hn0Var.l();
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            MessageObject messageObject = (MessageObject) obj;
            if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
                arrayList3.add(messageObject);
            }
        }
        ArrayList arrayList4 = this.f25089f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            MessageObject messageObject2 = (MessageObject) obj2;
            if (!messageObject2.isRoundVideo() && !messageObject2.isVoice()) {
                arrayList4.add(messageObject2);
            }
        }
        this.f25091r = 0;
        this.f25092s = -1;
        this.v = -1;
        this.f25093w = -1;
        this.f25094x = -1;
        this.f25095y = -1;
        this.E = -1;
        this.H = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.f25091r;
            int i14 = i13 + 1;
            this.f25091r = i14;
            this.f25092s = i13;
            this.v = i14;
            int size3 = arrayList3.size() + i14;
            this.f25091r = size3;
            this.f25093w = size3;
            while (true) {
                if (i10 >= arrayList3.size()) {
                    break;
                } else if (FileLoader.getInstance(this.d).isLoadingFile(((MessageObject) arrayList3.get(i10)).getFileName())) {
                    this.H = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            int i15 = this.f25091r;
            int i16 = i15 + 1;
            this.f25091r = i16;
            this.f25094x = i15;
            this.f25095y = i16;
            int size4 = arrayList4.size() + i16;
            this.f25091r = size4;
            this.E = size4;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.d).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(this.d).addObserver(this, NotificationCenter.premiumFloodWaitReceived);
        if (getVisibility() == 0) {
            DownloadController.getInstance(this.d).clearUnviewedDownloads();
        }
        if (!this.O) {
            this.O = true;
            Utilities.searchQueue.postRunnable(new jc0(this, 20));
        }
        d(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.d;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.premiumFloodWaitReceived);
    }

    @Override
    public final void requestLayout() {
        if (this.P) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.w10 w10Var) {
        this.I = w10Var;
    }
}
