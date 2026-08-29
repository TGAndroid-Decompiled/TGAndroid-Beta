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
public final class tm0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public final Activity B;
    public final org.telegram.ui.ActionBar.o2 C;
    public boolean D;
    public org.telegram.ui.g10 E;
    public final org.telegram.ui.z00 F;
    public String G;
    public String H;
    public mm0 I;
    public final pk0 J;
    public boolean K;
    public boolean L;
    public final qw0 f32977a;
    public final jh.e1 f32978b;
    public final sm0 f32979c;
    public final int d;
    public final ArrayList f32980e;
    public final ArrayList f32981f;
    public final ArrayList h;
    public final ArrayList f32982n;
    public int f32983r;
    public int f32984s;
    public int v;
    public int f32985w;
    public int f32986x;
    public int f32987y;

    public tm0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getParentActivity());
        sm0 sm0Var = new sm0(this);
        this.f32979c = sm0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.f32980e = arrayList;
        this.f32981f = new ArrayList();
        this.h = new ArrayList();
        this.f32982n = new ArrayList();
        this.f32984s = -1;
        this.v = -1;
        this.f32985w = -1;
        this.f32986x = -1;
        this.f32987y = -1;
        this.A = -1;
        this.F = new org.telegram.ui.z00(0, 0L);
        this.C = o2Var;
        this.B = o2Var.getParentActivity();
        this.d = i10;
        jh.e1 e1Var = new jh.e1(this, getContext(), 18);
        this.f32978b = e1Var;
        new f2.e0(new mh.f(this, 3)).d(e1Var);
        addView(e1Var);
        o2Var.getParentActivity();
        e1Var.setLayoutManager(new org.telegram.ui.k(8));
        e1Var.setAdapter(sm0Var);
        e1Var.setOnScrollListener(new h00(this, 6));
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.f6463m = false;
        e1Var.setItemAnimator(lVar);
        e1Var.setOnItemClickListener(new nm0(this, i10, 0));
        e1Var.setOnItemLongClickListener(new cv(this, 16));
        this.J = new pk0(e1Var, true);
        p00 p00Var = new p00(getContext(), null);
        addView(p00Var);
        p00Var.setUseHeaderOffset(true);
        p00Var.setViewType(3);
        p00Var.setVisibility(8);
        qw0 qw0Var = new qw0(getContext(), p00Var, 1, null);
        this.f32977a = qw0Var;
        addView(qw0Var);
        e1Var.setEmptyView(qw0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        jh.e1 e1Var;
        MessageObject message;
        int i10 = this.d;
        if (!UserConfig.getInstance(i10).isPremium() && (e1Var = this.f32978b) != null) {
            for (int i11 = 0; i11 < e1Var.getChildCount(); i11++) {
                try {
                    View childAt = e1Var.getChildAt(i11);
                    if ((childAt instanceof pm0) && (message = ((pm0) childAt).f31712a.getMessage()) != null) {
                        if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(false);
                        } else if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(true);
                        } else {
                            continue;
                        }
                        return;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    public final void b(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.L = z10;
        setPadding(0, i10, 0, i11);
        jh.e1 e1Var = this.f32978b;
        if (z10) {
            e1Var.o1(0, i10, 0, i11);
        } else {
            e1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.L = false;
    }

    public final void c(boolean z10) {
        float f9;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.o2 o2Var = this.C;
        if (o2Var != null && this.f32978b.C) {
            long currentTimeMillis = System.currentTimeMillis();
            int i12 = this.d;
            if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= MessagesController.getInstance(i12).uploadPremiumSpeedupNotifyPeriod * 1000) {
                ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
                if (!UserConfig.getInstance(i12).isPremium() && !MessagesController.getInstance(i12).premiumFeaturesBlocked()) {
                    if (z10) {
                        f9 = MessagesController.getInstance(i12).uploadPremiumSpeedupUpload;
                    } else {
                        f9 = MessagesController.getInstance(i12).uploadPremiumSpeedupDownload;
                    }
                    SpannableString spannableString = new SpannableString(Double.toString(Math.round(f9 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                    spannableString.setSpan(new t41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    if (!o2Var.hasStoryViewer()) {
                        tc a02 = tc.a0(o2Var);
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
                        mc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new p90(1, this, z10)), spannableString), i13);
                        M.f30652j = 8000;
                        M.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j10;
        sm0 sm0Var = this.f32979c;
        sm0Var.q(0, sm0Var.f32690c.f32983r);
        if (!TextUtils.isEmpty(this.G)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
                this.f32977a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.G.toLowerCase();
                boolean equals = lowerCase.equals(this.H);
                this.H = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.I);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                mm0 mm0Var = new mm0(this, arrayList, lowerCase, arrayList2);
                this.I = mm0Var;
                if (equals) {
                    j10 = 0;
                } else {
                    j10 = 300;
                }
                dispatchQueue.postRunnable(mm0Var, j10);
                this.f32982n.clear();
                this.h.clear();
                if (!equals) {
                    this.f32977a.e(true, true);
                    e(this.h, this.f32982n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f32983r == 0) {
            this.J.b(0);
        }
        if (this.K) {
            this.h.clear();
            this.f32982n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.f32982n);
        for (int i11 = 0; i11 < this.f32980e.size(); i11++) {
            ((MessageObject) this.f32980e.get(i11)).setQuery(null);
        }
        for (int i12 = 0; i12 < this.f32981f.size(); i12++) {
            ((MessageObject) this.f32981f.get(i12)).setQuery(null);
        }
        this.H = null;
        e(this.h, this.f32982n, z10);
        if (this.f32983r == 0) {
            this.f32977a.e(false, false);
            this.f32977a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.f32977a.f32122e.setVisibility(8);
        }
        this.f32977a.setStickerType(9);
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
        f2.n1 T;
        sm0 sm0Var = this.f32979c;
        if (z10) {
            int i10 = this.f32984s;
            int i11 = this.v;
            int i12 = this.f32985w;
            int i13 = this.f32986x;
            int i14 = this.f32987y;
            int i15 = this.A;
            int i16 = this.f32983r;
            ArrayList arrayList3 = new ArrayList(this.f32980e);
            ArrayList arrayList4 = new ArrayList(this.f32981f);
            f(arrayList, arrayList2);
            f2.q.c(new om0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).b(sm0Var);
            int i17 = 0;
            while (true) {
                jh.e1 e1Var = this.f32978b;
                if (i17 < e1Var.getChildCount()) {
                    View childAt = e1Var.getChildAt(i17);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = e1Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.s3) {
                            sm0Var.v(T, R);
                        } else if (childAt instanceof pm0) {
                            org.telegram.ui.Cells.g7 g7Var = ((pm0) childAt).f31712a;
                            g7Var.f(true);
                            int id2 = g7Var.getMessage().getId();
                            long dialogId = g7Var.getMessage().getDialogId();
                            org.telegram.ui.z00 z00Var = this.F;
                            z00Var.f45005a = dialogId;
                            z00Var.f45006b = id2;
                            g7Var.b(this.E.b(z00Var), true);
                        }
                    }
                    i17++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            sm0Var.l();
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.f32980e;
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
        ArrayList arrayList4 = this.f32981f;
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
        this.f32983r = 0;
        this.f32984s = -1;
        this.v = -1;
        this.f32985w = -1;
        this.f32986x = -1;
        this.f32987y = -1;
        this.A = -1;
        this.D = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.f32983r;
            int i14 = i13 + 1;
            this.f32983r = i14;
            this.f32984s = i13;
            this.v = i14;
            int size3 = arrayList3.size() + i14;
            this.f32983r = size3;
            this.f32985w = size3;
            while (true) {
                if (i10 >= arrayList3.size()) {
                    break;
                } else if (FileLoader.getInstance(this.d).isLoadingFile(((MessageObject) arrayList3.get(i10)).getFileName())) {
                    this.D = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            int i15 = this.f32983r;
            int i16 = i15 + 1;
            this.f32983r = i16;
            this.f32986x = i15;
            this.f32987y = i16;
            int size4 = arrayList4.size() + i16;
            this.f32983r = size4;
            this.A = size4;
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
        if (!this.K) {
            this.K = true;
            Utilities.searchQueue.postRunnable(new xb0(this, 20));
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
        if (this.L) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.g10 g10Var) {
        this.E = g10Var;
    }
}
