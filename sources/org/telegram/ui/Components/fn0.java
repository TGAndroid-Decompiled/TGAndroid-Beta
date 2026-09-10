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
public final class fn0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final Activity F;
    public final org.telegram.ui.ActionBar.p2 G;
    public boolean H;
    public org.telegram.ui.y10 I;
    public final org.telegram.ui.r10 J;
    public String K;
    public String L;
    public ym0 M;
    public final zk0 N;
    public boolean O;
    public boolean P;
    public final jx0 f23039a;
    public final bi.y1 f23040b;
    public final en0 f23041c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f23042f;
    public final ArrayList h;
    public final ArrayList f23043n;
    public int f23044r;
    public int f23045s;
    public int v;
    public int f23046w;
    public int f23047x;
    public int f23048y;

    public fn0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        super(p2Var.getParentActivity());
        en0 en0Var = new en0(this);
        this.f23041c = en0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f23042f = new ArrayList();
        this.h = new ArrayList();
        this.f23043n = new ArrayList();
        this.f23045s = -1;
        this.v = -1;
        this.f23046w = -1;
        this.f23047x = -1;
        this.f23048y = -1;
        this.E = -1;
        this.J = new org.telegram.ui.r10(0, 0L);
        this.G = p2Var;
        this.F = p2Var.getParentActivity();
        this.d = i10;
        bi.y1 y1Var = new bi.y1(this, getContext(), 18);
        this.f23040b = y1Var;
        new s4.y(new ai.k(this, 3)).d(y1Var);
        addView(y1Var);
        p2Var.getParentActivity();
        y1Var.setLayoutManager(new fg.a0(10));
        y1Var.setAdapter(en0Var);
        y1Var.setOnScrollListener(new al0(this, 1));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f41645m = false;
        y1Var.setItemAnimator(jVar);
        y1Var.setOnItemClickListener(new zm0(this, i10, 0));
        y1Var.setOnItemLongClickListener(new pv(this, 16));
        this.N = new zk0(y1Var, true);
        a10 a10Var = new a10(getContext(), null);
        addView(a10Var);
        a10Var.setUseHeaderOffset(true);
        a10Var.setViewType(3);
        a10Var.setVisibility(8);
        jx0 jx0Var = new jx0(getContext(), a10Var, 1, null);
        this.f23039a = jx0Var;
        addView(jx0Var);
        y1Var.setEmptyView(jx0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        bi.y1 y1Var;
        MessageObject message;
        int i10 = this.d;
        if (!UserConfig.getInstance(i10).isPremium() && (y1Var = this.f23040b) != null) {
            for (int i11 = 0; i11 < y1Var.getChildCount(); i11++) {
                try {
                    View childAt = y1Var.getChildAt(i11);
                    if ((childAt instanceof bn0) && (message = ((bn0) childAt).f21863a.getMessage()) != null) {
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
        bi.y1 y1Var = this.f23040b;
        if (z10) {
            y1Var.n1(0, i10, 0, i11);
        } else {
            y1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) y1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.P = false;
    }

    public final void c(boolean z10) {
        float f7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.p2 p2Var = this.G;
        if (p2Var != null && this.f23040b.G) {
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
                    spannableString.setSpan(new s51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    if (!p2Var.hasStoryViewer()) {
                        wc a02 = wc.a0(p2Var);
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
                        pc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new ai.j(27, this, z10)), spannableString), i13);
                        M.f26081j = 8000;
                        M.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j3;
        en0 en0Var = this.f23041c;
        en0Var.q(0, en0Var.f22732c.f23044r);
        if (!TextUtils.isEmpty(this.K)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
                this.f23039a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.K.toLowerCase();
                boolean equals = lowerCase.equals(this.L);
                this.L = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.M);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                ym0 ym0Var = new ym0(this, arrayList, lowerCase, arrayList2);
                this.M = ym0Var;
                if (equals) {
                    j3 = 0;
                } else {
                    j3 = 300;
                }
                dispatchQueue.postRunnable(ym0Var, j3);
                this.f23043n.clear();
                this.h.clear();
                if (!equals) {
                    this.f23039a.e(true, true);
                    e(this.h, this.f23043n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f23044r == 0) {
            this.N.b(0);
        }
        if (this.O) {
            this.h.clear();
            this.f23043n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.f23043n);
        for (int i11 = 0; i11 < this.e.size(); i11++) {
            ((MessageObject) this.e.get(i11)).setQuery(null);
        }
        for (int i12 = 0; i12 < this.f23042f.size(); i12++) {
            ((MessageObject) this.f23042f.get(i12)).setQuery(null);
        }
        this.L = null;
        e(this.h, this.f23043n, z10);
        if (this.f23044r == 0) {
            this.f23039a.e(false, false);
            this.f23039a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.f23039a.e.setVisibility(8);
        }
        this.f23039a.setStickerType(9);
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
        s4.c1 T;
        en0 en0Var = this.f23041c;
        if (z10) {
            int i10 = this.f23045s;
            int i11 = this.v;
            int i12 = this.f23046w;
            int i13 = this.f23047x;
            int i14 = this.f23048y;
            int i15 = this.E;
            int i16 = this.f23044r;
            ArrayList arrayList3 = new ArrayList(this.e);
            ArrayList arrayList4 = new ArrayList(this.f23042f);
            f(arrayList, arrayList2);
            s4.o.c(new an0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).b(en0Var);
            int i17 = 0;
            while (true) {
                bi.y1 y1Var = this.f23040b;
                if (i17 < y1Var.getChildCount()) {
                    View childAt = y1Var.getChildAt(i17);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = y1Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.u3) {
                            en0Var.v(T, R);
                        } else if (childAt instanceof bn0) {
                            org.telegram.ui.Cells.l7 l7Var = ((bn0) childAt).f21863a;
                            l7Var.f(true);
                            int id2 = l7Var.getMessage().getId();
                            long dialogId = l7Var.getMessage().getDialogId();
                            org.telegram.ui.r10 r10Var = this.J;
                            r10Var.f36168a = dialogId;
                            r10Var.f36169b = id2;
                            l7Var.b(this.I.b(r10Var), true);
                        }
                    }
                    i17++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            en0Var.l();
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
        ArrayList arrayList4 = this.f23042f;
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
        this.f23044r = 0;
        this.f23045s = -1;
        this.v = -1;
        this.f23046w = -1;
        this.f23047x = -1;
        this.f23048y = -1;
        this.E = -1;
        this.H = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.f23044r;
            int i14 = i13 + 1;
            this.f23044r = i14;
            this.f23045s = i13;
            this.v = i14;
            int size3 = arrayList3.size() + i14;
            this.f23044r = size3;
            this.f23046w = size3;
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
            int i15 = this.f23044r;
            int i16 = i15 + 1;
            this.f23044r = i16;
            this.f23047x = i15;
            this.f23048y = i16;
            int size4 = arrayList4.size() + i16;
            this.f23044r = size4;
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
            Utilities.searchQueue.postRunnable(new kc0(this, 20));
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

    public void setUiCallback(org.telegram.ui.y10 y10Var) {
        this.I = y10Var;
    }
}
