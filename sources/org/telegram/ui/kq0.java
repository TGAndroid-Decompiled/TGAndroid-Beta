package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;
public final class kq0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public final eo F;
    public int G;
    public boolean H;
    public org.telegram.ui.ActionBar.p1 I;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public org.telegram.ui.ActionBar.g1[] K;
    public FrameLayout L;
    public org.telegram.ui.Components.nu M;
    public k0 N;
    public ImageView O;
    public fq0 P;
    public t50 Q;
    public View R;
    public final TextPaint S;
    public final RectF T;
    public final Paint U;
    public jq0 V;
    public CharSequence f34438a;
    public final HashMap f34439b;
    public final ArrayList f34440c;
    public ArrayList d;
    public boolean e;
    public int f34441f;
    public org.telegram.ui.Components.vl0 h;
    public iq0 f34442n;
    public FrameLayout f34443r;
    public TextView f34444s;
    public boolean v;
    public final int f34445w;
    public boolean f34446x;
    public final boolean f34447y;

    public kq0(int i10, boolean z10, boolean z11, eo eoVar) {
        super(null);
        this.f34439b = new HashMap();
        this.f34440c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f34441f = 2;
        this.f34446x = true;
        this.H = true;
        this.S = new TextPaint(1);
        this.T = new RectF();
        this.U = new Paint(1);
        this.F = eoVar;
        this.f34445w = i10;
        this.f34447y = z10;
        this.E = z11;
    }

    public static void U(kq0 kq0Var, MediaController.AlbumEntry albumEntry) {
        if (albumEntry != null) {
            br0 br0Var = new br0(0, albumEntry, kq0Var.f34439b, kq0Var.f34440c, kq0Var.f34445w, kq0Var.E, kq0Var.F, false);
            Editable text = kq0Var.M.getText();
            kq0Var.f34438a = text;
            br0Var.d = text;
            org.telegram.ui.Components.nu nuVar = br0Var.f31369d0;
            if (nuVar != null) {
                nuVar.setText(text);
            }
            br0Var.f31387s0 = new gq0(kq0Var);
            br0Var.f0(kq0Var.G, kq0Var.H);
            kq0Var.presentFragment(br0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (kq0Var.f34447y) {
            gr0 gr0Var = new gr0(hashMap, arrayList, kq0Var.f34445w, kq0Var.E, kq0Var.F);
            Editable text2 = kq0Var.M.getText();
            kq0Var.f34438a = text2;
            br0 br0Var2 = gr0Var.f33166a;
            if (br0Var2 != null) {
                br0Var2.d = text2;
                org.telegram.ui.Components.nu nuVar2 = br0Var2.f31369d0;
                if (nuVar2 != null) {
                    nuVar2.setText(text2);
                }
            }
            hq0 hq0Var = new hq0(kq0Var, hashMap, arrayList);
            br0 br0Var3 = gr0Var.f33166a;
            br0Var3.f31387s0 = hq0Var;
            br0 br0Var4 = gr0Var.f33167b;
            br0Var4.f31387s0 = hq0Var;
            br0Var3.f31388t0 = new fr0(gr0Var, 0);
            br0Var4.f31388t0 = new fr0(gr0Var, 1);
            int i10 = kq0Var.G;
            boolean z10 = kq0Var.H;
            br0Var3.f0(i10, z10);
            gr0Var.f33167b.f0(i10, z10);
            kq0Var.presentFragment(gr0Var);
            return;
        }
        br0 br0Var5 = new br0(0, albumEntry, hashMap, arrayList, kq0Var.f34445w, kq0Var.E, kq0Var.F, false);
        Editable text3 = kq0Var.M.getText();
        kq0Var.f34438a = text3;
        br0Var5.d = text3;
        org.telegram.ui.Components.nu nuVar3 = br0Var5.f31369d0;
        if (nuVar3 != null) {
            nuVar3.setText(text3);
        }
        br0Var5.f31387s0 = new dq0(kq0Var, hashMap, arrayList);
        br0Var5.f0(kq0Var.G, kq0Var.H);
        kq0Var.presentFragment(br0Var5);
    }

    public final void V(HashMap hashMap, ArrayList arrayList, boolean z10, int i10) {
        if (!hashMap.isEmpty() && this.V != null && !this.v) {
            this.v = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Object obj = hashMap.get(arrayList.get(i11));
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                arrayList2.add(sendingMediaInfo);
                String str = null;
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    String str2 = photoEntry.imagePath;
                    if (str2 != null) {
                        sendingMediaInfo.path = str2;
                    } else {
                        sendingMediaInfo.path = photoEntry.path;
                    }
                    sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                    sendingMediaInfo.coverPath = photoEntry.coverPath;
                    sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                    sendingMediaInfo.isVideo = photoEntry.isVideo;
                    CharSequence charSequence = photoEntry.caption;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    sendingMediaInfo.caption = str;
                    sendingMediaInfo.entities = photoEntry.entities;
                    sendingMediaInfo.masks = photoEntry.stickers;
                    sendingMediaInfo.ttl = photoEntry.ttl;
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    String str3 = searchImage.imagePath;
                    if (str3 != null) {
                        sendingMediaInfo.path = str3;
                    } else {
                        sendingMediaInfo.searchImage = searchImage;
                    }
                    sendingMediaInfo.thumbPath = searchImage.thumbPath;
                    sendingMediaInfo.coverPath = searchImage.coverPath;
                    sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                    CharSequence charSequence2 = searchImage.caption;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    sendingMediaInfo.caption = str;
                    sendingMediaInfo.entities = searchImage.entities;
                    sendingMediaInfo.masks = searchImage.stickers;
                    sendingMediaInfo.ttl = searchImage.ttl;
                    TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                    if (botInlineResult != null && searchImage.type == 1) {
                        sendingMediaInfo.inlineResult = botInlineResult;
                        sendingMediaInfo.params = searchImage.params;
                    }
                    searchImage.date = (int) (System.currentTimeMillis() / 1000);
                }
            }
            this.V.a(arrayList2);
        }
    }

    public final void W(boolean z10) {
        boolean z11;
        Integer num;
        float f7;
        float f10;
        float f11;
        float f12;
        float dp;
        if (this.L.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        FrameLayout frameLayout = this.L;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        frameLayout.setTag(num);
        if (this.M.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.M.getEditText());
        }
        this.M.k(true);
        if (z10) {
            this.L.setVisibility(0);
            this.N.setVisibility(0);
        } else {
            this.L.setVisibility(4);
            this.N.setVisibility(4);
        }
        k0 k0Var = this.N;
        float f13 = 0.2f;
        float f14 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.2f;
        }
        k0Var.setScaleX(f7);
        k0 k0Var2 = this.N;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        k0Var2.setScaleY(f10);
        k0 k0Var3 = this.N;
        float f15 = 0.0f;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        k0Var3.setAlpha(f11);
        t50 t50Var = this.Q;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.2f;
        }
        t50Var.setScaleX(f12);
        t50 t50Var2 = this.Q;
        if (z10) {
            f13 = 1.0f;
        }
        t50Var2.setScaleY(f13);
        t50 t50Var3 = this.Q;
        if (!z10) {
            f14 = 0.0f;
        }
        t50Var3.setAlpha(f14);
        FrameLayout frameLayout2 = this.L;
        if (z10) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(48.0f);
        }
        frameLayout2.setTranslationY(dp);
        View view = this.R;
        if (!z10) {
            f15 = AndroidUtilities.dp(48.0f);
        }
        view.setTranslationY(f15);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f17998h5;
        lVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f18034j5;
        lVar2.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i11, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new eq0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (this.f34446x) {
            n10.a(2, R.drawable.outline_header_search).setContentDescription(LocaleController.getString(R.string.Search));
        }
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        fq0 fq0Var = new fq0(this, context);
        this.P = fq0Var;
        fq0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.fragmentView = this.P;
        this.actionBar.setTitle(LocaleController.getString(R.string.Gallery));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.h = vl0Var;
        vl0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new s4.c0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.P.addView(this.h, w7.a6.e(-1, -1, 51));
        org.telegram.ui.Components.vl0 vl0Var2 = this.h;
        iq0 iq0Var = new iq0(this, context);
        this.f34442n = iq0Var;
        vl0Var2.setAdapter(iq0Var);
        this.h.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        TextView textView = new TextView(context);
        this.f34444s = textView;
        textView.setTextColor(-8355712);
        this.f34444s.setTextSize(1, 20.0f);
        this.f34444s.setGravity(17);
        this.f34444s.setVisibility(8);
        this.f34444s.setText(LocaleController.getString(R.string.NoPhotos));
        this.P.addView(this.f34444s, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f34444s.setOnTouchListener(new ai.h(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34443r = frameLayout;
        frameLayout.setVisibility(8);
        this.P.addView(this.f34443r, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f34443r.addView(radialProgressView, w7.a6.e(-2, -2, 17));
        View view = new View(context);
        this.R = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.R.setTranslationY(AndroidUtilities.dp(48.0f));
        this.P.addView(this.R, w7.a6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.L.setVisibility(4);
        this.L.setTranslationY(AndroidUtilities.dp(48.0f));
        this.P.addView(this.L, w7.a6.e(-1, 48, 83));
        this.L.setOnTouchListener(new ai.h(2));
        org.telegram.ui.Components.nu nuVar = this.M;
        if (nuVar != null) {
            nuVar.o();
        }
        this.M = new org.telegram.ui.Components.nu(context, this.P, null, 1, false, null);
        this.M.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
        this.M.setHint(LocaleController.getString(R.string.AddCaption));
        org.telegram.ui.Components.fu editText = this.M.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.L.addView(this.M, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.f34438a;
        if (charSequence != null) {
            this.M.setText(charSequence);
        }
        k0 k0Var = new k0(this, context, 16);
        this.N = k0Var;
        k0Var.setFocusable(true);
        this.N.setFocusableInTouchMode(true);
        this.N.setVisibility(4);
        this.N.setScaleX(0.2f);
        this.N.setScaleY(0.2f);
        this.N.setAlpha(0.0f);
        this.P.addView(this.N, w7.a6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.O = new ImageView(context);
        this.O.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.S5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.T5, false)));
        this.O.setImageResource(R.drawable.attach_send);
        this.O.setImportantForAccessibility(2);
        this.O.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U5, false), PorterDuff.Mode.MULTIPLY));
        this.O.setScaleType(ImageView.ScaleType.CENTER);
        this.O.setOutlineProvider(new bi.g(16));
        this.N.addView(this.O, w7.a6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.O.setOnClickListener(new l60(this, 17));
        this.O.setOnLongClickListener(new v(this, 3));
        TextPaint textPaint = this.S;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        t50 t50Var = new t50(this, context, 2);
        this.Q = t50Var;
        t50Var.setAlpha(0.0f);
        this.Q.setScaleX(0.2f);
        this.Q.setScaleY(0.2f);
        this.P.addView(this.Q, w7.a6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.f34445w != 0) {
            this.M.setVisibility(8);
        }
        if (this.e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f34443r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f34443r.setVisibility(8);
            this.h.setEmptyView(this.f34444s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.albumsDidLoad) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i12 = this.f34445w;
                if (i12 != 1 && i12 != 2 && i12 != 10 && this.f34446x) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f34443r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.vl0 vl0Var = this.h;
                if (vl0Var != null && vl0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f34444s);
                }
                iq0 iq0Var = this.f34442n;
                if (iq0Var != null) {
                    iq0Var.l();
                }
                this.e = false;
            }
        } else if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f17998h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f18034j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(lVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.R4}, null, org.telegram.ui.ActionBar.j6.f17932da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.j6.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.nu nuVar = this.M;
        if (nuVar != null && nuVar.e) {
            if (z10) {
                nuVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.vl0 vl0Var = this.h;
        if (vl0Var != null) {
            vl0Var.getViewTreeObserver().addOnPreDrawListener(new gi(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.f34445w;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2 && i10 != 10 && this.f34446x) {
            this.d = MediaController.allMediaAlbums;
        } else {
            this.d = MediaController.allPhotoAlbums;
        }
        if (this.d != null) {
            z10 = false;
        }
        this.e = z10;
        MediaController.loadGalleryPhotosAlbums(this.classGuid);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.nu nuVar = this.M;
        if (nuVar != null) {
            nuVar.o();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        iq0 iq0Var = this.f34442n;
        if (iq0Var != null) {
            iq0Var.l();
        }
        org.telegram.ui.Components.nu nuVar = this.M;
        if (nuVar != null) {
            nuVar.s();
        }
        org.telegram.ui.Components.vl0 vl0Var = this.h;
        if (vl0Var != null) {
            vl0Var.getViewTreeObserver().addOnPreDrawListener(new gi(this, 3));
        }
    }
}
