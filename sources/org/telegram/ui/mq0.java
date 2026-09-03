package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mq0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean B;
    public boolean C;
    public String D;
    public int E;
    public boolean F;
    public final MediaController.AlbumEntry G;
    public org.telegram.ui.Components.sl0 H;
    public kq0 I;
    public gq0 J;
    public org.telegram.ui.Components.zw0 K;
    public kh.m L;
    public org.telegram.ui.ActionBar.w0 M;
    public org.telegram.ui.ActionBar.g1 N;
    public int O;
    public boolean P;
    public final int Q;
    public final xn R;
    public org.telegram.ui.Components.vl0 S;
    public int T;
    public boolean U;
    public boolean V;
    public FrameLayout W;
    public l0 X;
    public fg.h0 Y;
    public View Z;
    public final int f39031a;
    public org.telegram.ui.Components.fu f39032a0;
    public final HashMap f39033b;
    public ImageView f39034b0;
    public final ArrayList f39035c;
    public fq0 f39036c0;
    public CharSequence d;
    public int f39037d0;
    public boolean f39038e;
    public final TextPaint f39039e0;
    public final ArrayList f39040f;
    public final RectF f39041f0;
    public final Paint f39042g0;
    public final HashMap h;
    public AnimatorSet f39043h0;
    public boolean f39044i0;
    public org.telegram.ui.ActionBar.p1 f39045j0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f39046k0;
    public org.telegram.ui.ActionBar.g1[] f39047l0;
    public String m0;
    public final ArrayList f39048n;
    public boolean f39049n0;
    public final boolean f39050o0;
    public lq0 f39051p0;
    public qq0 f39052q0;
    public boolean f39053r;
    public final int f39054r0;
    public boolean f39055s;
    public final int f39056s0;
    public final int f39057t0;
    public final cq0 f39058u0;
    public String v;
    public String f39059w;
    public int f39060x;
    public int f39061y;

    public mq0(int i10, MediaController.AlbumEntry albumEntry, HashMap hashMap, ArrayList arrayList, int i11, boolean z4, xn xnVar, boolean z10) {
        super(null);
        this.f39040f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.f39048n = new ArrayList();
        this.f39055s = true;
        this.F = true;
        this.O = 100;
        this.f39037d0 = 3;
        this.f39039e0 = new TextPaint(1);
        this.f39041f0 = new RectF();
        this.f39042g0 = new Paint(1);
        this.f39049n0 = true;
        this.f39058u0 = new cq0(this);
        this.G = albumEntry;
        this.f39033b = hashMap;
        this.f39035c = arrayList;
        this.f39031a = i10;
        this.Q = i11;
        this.R = xnVar;
        this.B = z4;
        this.f39050o0 = z10;
        if (albumEntry == null) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0);
            int i12 = sharedPreferences.getInt("count", 0);
            for (int i13 = 0; i13 < i12; i13++) {
                String string = sharedPreferences.getString("recent" + i13, null);
                if (string == null) {
                    break;
                }
                this.f39048n.add(string);
            }
        }
        if (z10) {
            this.f39054r0 = org.telegram.ui.ActionBar.k6.f21973ug;
            this.f39056s0 = org.telegram.ui.ActionBar.k6.f21743hg;
            this.f39057t0 = org.telegram.ui.ActionBar.k6.f21760ig;
            return;
        }
        this.f39054r0 = org.telegram.ui.ActionBar.k6.f21733h5;
        this.f39056s0 = org.telegram.ui.ActionBar.k6.f21768j5;
        this.f39057t0 = org.telegram.ui.ActionBar.k6.I5;
    }

    public static void U(mq0 mq0Var, TLObject tLObject, boolean z4) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(mq0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(mq0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(mq0Var.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = mq0Var.D;
        mq0Var.D = null;
        mq0Var.d0(str, "", z4, false);
    }

    public static org.telegram.ui.Cells.t5 V(mq0 mq0Var, int i10) {
        int childCount = mq0Var.H.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = mq0Var.H.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = mq0Var.G;
                if (albumEntry == null ? !(intValue < 0 || intValue >= mq0Var.f39040f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        return t5Var;
                    }
                }
            }
        }
        return null;
    }

    public final int Y(int i10, Object obj) {
        Object obj2;
        boolean z4 = obj instanceof MediaController.PhotoEntry;
        if (z4) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f18051id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        HashMap hashMap = this.f39033b;
        boolean containsKey = hashMap.containsKey(obj2);
        ArrayList arrayList = this.f39035c;
        if (containsKey) {
            hashMap.remove(obj2);
            int indexOf = arrayList.indexOf(obj2);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            if (this.f39038e) {
                h0();
            }
            if (i10 >= 0) {
                if (z4) {
                    ((MediaController.PhotoEntry) obj).reset();
                } else if (obj instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj).reset();
                }
                this.f39058u0.W(i10);
            }
            return indexOf;
        }
        hashMap.put(obj2, obj);
        arrayList.add(obj2);
        return -1;
    }

    public final void Z() {
        this.f39048n.clear();
        kq0 kq0Var = this.I;
        if (kq0Var != null) {
            kq0Var.l();
        }
        this.K.e(false, true);
        c0();
    }

    public final void a0(View view, Object obj) {
        boolean z4;
        int i10 = 1;
        if (Y(-1, obj) == -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).b(this.f39035c.contains(Integer.valueOf(this.G.photos.get(((Integer) view.getTag()).intValue()).imageId)), true);
        }
        if (!z4) {
            i10 = 2;
        }
        i0(i10);
        this.f39051p0.a();
    }

    public final void b0(EditText editText) {
        boolean z4;
        if (editText.getText().length() == 0) {
            return;
        }
        String obj = editText.getText().toString();
        this.f39040f.clear();
        this.h.clear();
        this.f39055s = true;
        if (this.f39031a == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        d0(obj, "", z4, true);
        this.v = obj;
        if (obj.length() == 0) {
            this.v = null;
            this.K.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        } else {
            this.K.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, this.v));
        }
        j0();
    }

    public final void c0() {
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.f39048n.size());
        int size = this.f39048n.size();
        for (int i10 = 0; i10 < size; i10++) {
            edit.putString(l.d.j(i10, "recent"), (String) this.f39048n.get(i10));
        }
        edit.commit();
    }

    @Override
    public final View createView(Context context) {
        boolean z4;
        this.V = false;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = this.f39054r0;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = this.f39056s0;
        kVar2.setTitleColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.actionBar.C(org.telegram.ui.ActionBar.k6.w0(null, i11, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.k6.w0(null, this.f39057t0, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i12 = this.f39031a;
        MediaController.AlbumEntry albumEntry = this.G;
        if (albumEntry != null) {
            this.actionBar.setTitle(albumEntry.bucketName);
        } else if (i12 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchImagesTitle));
        } else if (i12 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchGifsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 2));
        if (this.f39044i0) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            a2.setSubMenuDelegate(new dq0(this));
            this.N = a2.e(1, R.drawable.msg_list, LocaleController.getString(R.string.ShowAsList));
            a2.e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        }
        if (albumEntry == null) {
            org.telegram.ui.ActionBar.w0 a10 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a10.F();
            a10.E = new eq0(this);
            this.M = a10;
            EditTextBoldCursor searchField = a10.getSearchField();
            searchField.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
            searchField.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
            searchField.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Vd, false));
        }
        if (albumEntry == null) {
            if (i12 == 0) {
                this.M.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
            } else if (i12 == 1) {
                this.M.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
            }
        }
        fq0 fq0Var = new fq0(this, context);
        this.f39036c0 = fq0Var;
        fq0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.fragmentView = this.f39036c0;
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.H = sl0Var;
        sl0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
        this.H.setClipToPadding(false);
        this.H.setHorizontalScrollBarEnabled(false);
        this.H.setVerticalScrollBarEnabled(false);
        this.H.setItemAnimator(null);
        this.H.setLayoutAnimation(null);
        org.telegram.ui.Components.sl0 sl0Var2 = this.H;
        ?? wVar = new f2.w(4);
        this.J = wVar;
        sl0Var2.setLayoutManager(wVar);
        this.J.O = new hq0(this);
        this.f39036c0.addView(this.H, k7.c6.e(-1, -1, 51));
        org.telegram.ui.Components.sl0 sl0Var3 = this.H;
        kq0 kq0Var = new kq0(this, context);
        this.I = kq0Var;
        sl0Var3.setAdapter(kq0Var);
        this.H.setGlowColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.H.setOnItemClickListener(new j(this, 21));
        if (this.E != 1) {
            this.H.setOnItemLongClickListener(new aq0(this, 2));
        }
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(new iq0(this));
        this.S = vl0Var;
        if (this.E != 1) {
            this.H.B.add(vl0Var);
        }
        kh.m mVar = new kh.m(context, 1, getResourceProvider());
        this.L = mVar;
        mVar.setAlpha(0.0f);
        this.L.setVisibility(8);
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, this.L, 1, getResourceProvider());
        this.K = zw0Var;
        zw0Var.setAnimateLayoutChange(true);
        this.K.d.setTypeface(Typeface.DEFAULT);
        this.K.d.setTextSize(1, 16.0f);
        this.K.d.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f22038y6));
        this.K.addView(this.L, 0);
        if (albumEntry != null) {
            this.K.d.setText(LocaleController.getString(R.string.NoPhotos));
        } else {
            this.K.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        }
        this.K.e(false, false);
        this.f39036c0.addView(this.K, k7.c6.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.H.setOnScrollListener(new bq0(this));
        if (albumEntry == null) {
            j0();
        }
        if (this.f39049n0) {
            View view = new View(context);
            this.Z = view;
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            this.Z.setTranslationY(AndroidUtilities.dp(48.0f));
            this.f39036c0.addView(this.Z, k7.c6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.W = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
            this.W.setVisibility(4);
            this.W.setTranslationY(AndroidUtilities.dp(48.0f));
            this.f39036c0.addView(this.W, k7.c6.e(-1, 48, 83));
            this.W.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
            org.telegram.ui.Components.fu fuVar = this.f39032a0;
            if (fuVar != null) {
                fuVar.o();
            }
            this.f39032a0 = new org.telegram.ui.Components.fu(context, this.f39036c0, null, 1, false, null);
            this.f39032a0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
            this.f39032a0.setHint(LocaleController.getString(R.string.AddCaption));
            this.f39032a0.s();
            org.telegram.ui.Components.xt editText = this.f39032a0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.W.addView(this.f39032a0, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f39032a0.setText(charSequence);
            }
            this.f39032a0.getEditText().addTextChangedListener(new n0(this, 14));
            l0 l0Var = new l0(this, context, 17);
            this.X = l0Var;
            l0Var.setFocusable(true);
            this.X.setFocusableInTouchMode(true);
            this.X.setVisibility(4);
            this.X.setScaleX(0.2f);
            this.X.setScaleY(0.2f);
            this.X.setAlpha(0.0f);
            this.f39036c0.addView(this.X, k7.c6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f39034b0 = new ImageView(context);
            this.f39034b0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.S5, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.T5, false)));
            this.f39034b0.setImageResource(R.drawable.attach_send);
            this.f39034b0.setImportantForAccessibility(2);
            this.f39034b0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.U5, false), PorterDuff.Mode.MULTIPLY));
            this.f39034b0.setScaleType(ImageView.ScaleType.CENTER);
            this.f39034b0.setOutlineProvider(new hg.j1(16));
            this.X.addView(this.f39034b0, k7.c6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f39034b0.setOnClickListener(new f60(this, 18));
            this.f39034b0.setOnLongClickListener(new w(this, 4));
            TextPaint textPaint = this.f39039e0;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            fg.h0 h0Var = new fg.h0(this, context, 28);
            this.Y = h0Var;
            h0Var.setAlpha(0.0f);
            this.Y.setScaleX(0.2f);
            this.Y.setScaleY(0.2f);
            this.f39036c0.addView(this.Y, k7.c6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.Q != 0) {
                this.f39032a0.setVisibility(8);
            }
        }
        if ((albumEntry != null || i12 == 0 || i12 == 1) && this.F) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f39038e = z4;
        this.H.setEmptyView(this.K);
        org.telegram.ui.Components.sl0 sl0Var4 = this.H;
        sl0Var4.V1 = true;
        sl0Var4.W1 = 0;
        i0(0);
        return this.fragmentView;
    }

    public final void d0(String str, String str2, boolean z4, boolean z10) {
        String str3;
        String str4;
        String str5;
        if (this.f39053r) {
            this.f39053r = false;
            if (this.f39060x != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f39060x, true);
                this.f39060x = 0;
            }
        }
        this.D = str;
        this.f39053r = true;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
        if (z4) {
            str3 = messagesController2.gifSearchBot;
        } else {
            str3 = messagesController2.imageSearchBot;
        }
        TLObject userOrChat = messagesController.getUserOrChat(str3);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (z10 && !this.C) {
                this.C = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                MessagesController messagesController3 = MessagesController.getInstance(this.currentAccount);
                if (z4) {
                    str5 = messagesController3.gifSearchBot;
                } else {
                    str5 = messagesController3.imageSearchBot;
                }
                tL_contacts_resolveUsername.username = str5;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new org.telegram.messenger.zd(10, this, z4));
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) userOrChat;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        tL_messages_getInlineBotResults.query = str4;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        tL_messages_getInlineBotResults.offset = str2;
        xn xnVar = this.R;
        if (xnVar != null) {
            long a2 = xnVar.a();
            if (DialogObject.isEncryptedDialog(a2)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().getInputPeer(a2);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i10 = this.f39061y + 1;
        this.f39061y = i10;
        this.f39060x = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.sb(this, str, i10, z4, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.f39060x, this.classGuid);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    public final void e0(int i10, boolean z4) {
        HashMap hashMap = this.f39033b;
        if (!hashMap.isEmpty() && this.f39051p0 != null && !this.P) {
            org.telegram.ui.Components.fu fuVar = this.f39032a0;
            if (fuVar != null && fuVar.f26997a.length() > 0) {
                Object obj = hashMap.get(this.f39035c.get(0));
                if (obj instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj).caption = this.f39032a0.getText().toString();
                } else if (obj instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj).caption = this.f39032a0.getText().toString();
                }
            }
            this.P = true;
            this.f39051p0.f(i10, false, z4);
            if (this.Q != 2) {
                lq0 lq0Var = this.f39051p0;
                if (lq0Var == null || lq0Var.e()) {
                    finishFragment();
                }
            }
        }
    }

    public final void f0(int i10, boolean z4) {
        this.E = i10;
        this.F = z4;
        if (i10 > 0 && this.f39031a == 1) {
            this.E = 1;
        }
    }

    public final boolean g0(boolean z4, boolean z10) {
        boolean z11;
        Integer num;
        float f10;
        float f11;
        float f12;
        float f13;
        float dp;
        float f14;
        float f15;
        float f16;
        float f17;
        float dp2;
        if (this.f39032a0 != null) {
            if (this.W.getTag() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z4 != z11) {
                AnimatorSet animatorSet = this.f39043h0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                FrameLayout frameLayout = this.W;
                if (z4) {
                    num = 1;
                } else {
                    num = null;
                }
                frameLayout.setTag(num);
                if (this.f39032a0.getEditText().isFocused()) {
                    AndroidUtilities.hideKeyboard(this.f39032a0.getEditText());
                }
                this.f39032a0.k(true);
                if (z4) {
                    this.W.setVisibility(0);
                    this.X.setVisibility(0);
                }
                float f18 = 0.0f;
                float f19 = 0.2f;
                float f20 = 1.0f;
                if (z10) {
                    this.f39043h0 = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    l0 l0Var = this.X;
                    Property property = View.SCALE_X;
                    if (z4) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(l0Var, property, f14));
                    l0 l0Var2 = this.X;
                    Property property2 = View.SCALE_Y;
                    if (z4) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, property2, f15));
                    l0 l0Var3 = this.X;
                    Property property3 = View.ALPHA;
                    if (z4) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(l0Var3, property3, f16));
                    fg.h0 h0Var = this.Y;
                    if (z4) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(h0Var, property, f17));
                    fg.h0 h0Var2 = this.Y;
                    if (z4) {
                        f19 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(h0Var2, property2, f19));
                    fg.h0 h0Var3 = this.Y;
                    if (!z4) {
                        f20 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(h0Var3, property3, f20));
                    FrameLayout frameLayout2 = this.W;
                    Property property4 = View.TRANSLATION_Y;
                    if (z4) {
                        dp2 = 0.0f;
                    } else {
                        dp2 = AndroidUtilities.dp(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property4, dp2));
                    View view = this.Z;
                    if (!z4) {
                        f18 = AndroidUtilities.dp(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(view, property4, f18));
                    this.f39043h0.playTogether(arrayList);
                    this.f39043h0.setInterpolator(new DecelerateInterpolator());
                    this.f39043h0.setDuration(180L);
                    this.f39043h0.addListener(new org.telegram.ui.Components.x20(23, this, z4));
                    this.f39043h0.start();
                    return true;
                }
                l0 l0Var4 = this.X;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                l0Var4.setScaleX(f10);
                l0 l0Var5 = this.X;
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.2f;
                }
                l0Var5.setScaleY(f11);
                l0 l0Var6 = this.X;
                if (z4) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                l0Var6.setAlpha(f12);
                fg.h0 h0Var4 = this.Y;
                if (z4) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.2f;
                }
                h0Var4.setScaleX(f13);
                fg.h0 h0Var5 = this.Y;
                if (z4) {
                    f19 = 1.0f;
                }
                h0Var5.setScaleY(f19);
                fg.h0 h0Var6 = this.Y;
                if (!z4) {
                    f20 = 0.0f;
                }
                h0Var6.setAlpha(f20);
                FrameLayout frameLayout3 = this.W;
                if (z4) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                frameLayout3.setTranslationY(dp);
                View view2 = this.Z;
                if (!z4) {
                    f18 = AndroidUtilities.dp(48.0f);
                }
                view2.setTranslationY(f18);
                if (!z4) {
                    this.W.setVisibility(4);
                    this.X.setVisibility(4);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39036c0, 1, null, null, null, null, this.f39054r0));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, this.f39054r0));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, this.f39056s0));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, this.f39056s0));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, this.f39057t0));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 134217728, null, null, null, null, this.f39056s0));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.k6.Vd));
        org.telegram.ui.ActionBar.w0 w0Var = this.M;
        if (w0Var != null) {
            editTextBoldCursor = w0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(editTextBoldCursor, 16777216, null, null, null, null, this.f39056s0));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.H, 32768, null, null, null, null, this.f39054r0));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.H, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.R4}, null, org.telegram.ui.ActionBar.k6.f21665da));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.H, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.k6.X9));
        return arrayList;
    }

    public final void h0() {
        boolean z4;
        if (this.f39038e) {
            int childCount = this.H.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.H.getChildAt(i10);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.t5;
                MediaController.AlbumEntry albumEntry = this.G;
                ArrayList arrayList = this.f39035c;
                if (z10) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    int i11 = -1;
                    if (albumEntry != null) {
                        MediaController.PhotoEntry photoEntry = albumEntry.photos.get(num.intValue());
                        if (this.f39038e) {
                            i11 = arrayList.indexOf(Integer.valueOf(photoEntry.imageId));
                        }
                        t5Var.setNum(i11);
                    } else {
                        MediaController.SearchImage searchImage = (MediaController.SearchImage) this.f39040f.get(num.intValue());
                        if (this.f39038e) {
                            i11 = arrayList.indexOf(searchImage.f18051id);
                        }
                        t5Var.setNum(i11);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                    if (arrayList.indexOf(Integer.valueOf(albumEntry.photos.get(((Integer) childAt.getTag()).intValue()).imageId)) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    i7Var.b(z4, false);
                }
            }
        }
    }

    public final void i0(int i10) {
        boolean z4;
        float f10;
        boolean z10 = true;
        if (this.f39033b.size() == 0) {
            this.Y.setPivotX(0.0f);
            this.Y.setPivotY(0.0f);
            if (i10 == 0) {
                z10 = false;
            }
            g0(false, z10);
            return;
        }
        this.Y.invalidate();
        if (i10 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!g0(true, z4) && i10 != 0) {
            this.Y.setPivotX(AndroidUtilities.dp(21.0f));
            this.Y.setPivotY(AndroidUtilities.dp(12.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            fg.h0 h0Var = this.Y;
            Property property = View.SCALE_X;
            float f11 = 0.9f;
            if (i10 == 1) {
                f10 = 1.1f;
            } else {
                f10 = 0.9f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(h0Var, property, f10, 1.0f);
            fg.h0 h0Var2 = this.Y;
            Property property2 = View.SCALE_Y;
            if (i10 == 1) {
                f11 = 1.1f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(h0Var2, property2, f11, 1.0f));
            animatorSet.setInterpolator(new OvershootInterpolator());
            animatorSet.setDuration(180L);
            animatorSet.start();
            return;
        }
        this.Y.setPivotX(0.0f);
        this.Y.setPivotY(0.0f);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void j0() {
        String str;
        kq0 kq0Var = this.I;
        if (kq0Var != null) {
            kq0Var.l();
        }
        if (!this.f39053r && (this.f39048n.size() <= 0 || ((str = this.v) != null && !TextUtils.isEmpty(str)))) {
            this.K.e(false, true);
        } else {
            this.K.e(true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.Components.fu fuVar = this.f39032a0;
        if (fuVar != null && fuVar.f27000e) {
            if (z4) {
                fuVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        if (this.f39060x != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f39060x, true);
            this.f39060x = 0;
        }
        org.telegram.ui.Components.fu fuVar = this.f39032a0;
        if (fuVar != null) {
            fuVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        org.telegram.ui.Components.sl0 sl0Var = this.H;
        if (sl0Var == null) {
            return;
        }
        if (this.f39032a0.f27000e) {
            this.fragmentView.setTranslationY(f10);
            this.H.setTranslationY(0.0f);
            return;
        }
        sl0Var.setTranslationY(f10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        kq0 kq0Var = this.I;
        if (kq0Var != null) {
            kq0Var.l();
        }
        org.telegram.ui.Components.fu fuVar = this.f39032a0;
        if (fuVar != null) {
            fuVar.s();
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.M;
        if (w0Var != null) {
            w0Var.z(true);
            if (!TextUtils.isEmpty(this.m0)) {
                this.M.H(this.m0, false);
                this.m0 = null;
                b0(this.M.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        org.telegram.ui.ActionBar.w0 w0Var;
        if (z4 && (w0Var = this.M) != null) {
            AndroidUtilities.showKeyboard(w0Var.getSearchField());
        }
    }
}
