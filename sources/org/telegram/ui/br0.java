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
public final class br0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public boolean F;
    public String G;
    public int H;
    public boolean I;
    public final MediaController.AlbumEntry J;
    public org.telegram.ui.Components.ll0 K;
    public zq0 L;
    public uq0 M;
    public org.telegram.ui.Components.xw0 N;
    public xq0 O;
    public org.telegram.ui.ActionBar.v0 P;
    public org.telegram.ui.ActionBar.f1 Q;
    public int R;
    public boolean S;
    public final int T;
    public final co U;
    public org.telegram.ui.Components.nl0 V;
    public int W;
    public boolean X;
    public boolean Y;
    public FrameLayout Z;
    public final int f34908a;
    public j0 f34909a0;
    public final HashMap f34910b;
    public t50 f34911b0;
    public final ArrayList f34912c;
    public View f34913c0;
    public CharSequence d;
    public org.telegram.ui.Components.hu f34914d0;
    public boolean f34915e;
    public ImageView f34916e0;
    public final ArrayList f34917f;
    public tq0 f34918f0;
    public int f34919g0;
    public final HashMap h;
    public final TextPaint f34920h0;
    public final RectF f34921i0;
    public final Paint f34922j0;
    public AnimatorSet f34923k0;
    public boolean f34924l0;
    public org.telegram.ui.ActionBar.n1 m0;
    public final ArrayList f34925n;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f34926n0;
    public org.telegram.ui.ActionBar.f1[] f34927o0;
    public String f34928p0;
    public boolean f34929q0;
    public boolean f34930r;
    public final boolean f34931r0;
    public boolean f34932s;
    public ar0 f34933s0;
    public fr0 f34934t0;
    public final int f34935u0;
    public String v;
    public final int f34936v0;
    public String f34937w;
    public final int f34938w0;
    public int f34939x;
    public final qq0 f34940x0;
    public int f34941y;

    public br0(int i10, MediaController.AlbumEntry albumEntry, HashMap hashMap, ArrayList arrayList, int i11, boolean z10, co coVar, boolean z11) {
        super(null);
        this.f34917f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.f34925n = new ArrayList();
        this.f34932s = true;
        this.I = true;
        this.R = 100;
        this.f34919g0 = 3;
        this.f34920h0 = new TextPaint(1);
        this.f34921i0 = new RectF();
        this.f34922j0 = new Paint(1);
        this.f34929q0 = true;
        this.f34940x0 = new qq0(this);
        this.J = albumEntry;
        this.f34910b = hashMap;
        this.f34912c = arrayList;
        this.f34908a = i10;
        this.T = i11;
        this.U = coVar;
        this.E = z10;
        this.f34931r0 = z11;
        if (albumEntry == null) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0);
            int i12 = sharedPreferences.getInt("count", 0);
            for (int i13 = 0; i13 < i12; i13++) {
                String string = sharedPreferences.getString("recent" + i13, null);
                if (string == null) {
                    break;
                }
                this.f34925n.add(string);
            }
        }
        if (z11) {
            this.f34935u0 = org.telegram.ui.ActionBar.j6.f21009ug;
            this.f34936v0 = org.telegram.ui.ActionBar.j6.f20770hg;
            this.f34938w0 = org.telegram.ui.ActionBar.j6.f20789ig;
            return;
        }
        this.f34935u0 = org.telegram.ui.ActionBar.j6.f20761h5;
        this.f34936v0 = org.telegram.ui.ActionBar.j6.f20797j5;
        this.f34938w0 = org.telegram.ui.ActionBar.j6.I5;
    }

    public static void U(br0 br0Var, TLObject tLObject, boolean z10) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(br0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(br0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(br0Var.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = br0Var.G;
        br0Var.G = null;
        br0Var.d0(str, "", z10, false);
    }

    public static org.telegram.ui.Cells.s5 V(br0 br0Var, int i10) {
        int childCount = br0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = br0Var.K.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                int intValue = ((Integer) s5Var.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = br0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= br0Var.f34917f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        return s5Var;
                    }
                }
            }
        }
        return null;
    }

    public final int Y(int i10, Object obj) {
        Object obj2;
        boolean z10 = obj instanceof MediaController.PhotoEntry;
        if (z10) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f17101id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        HashMap hashMap = this.f34910b;
        boolean containsKey = hashMap.containsKey(obj2);
        ArrayList arrayList = this.f34912c;
        if (containsKey) {
            hashMap.remove(obj2);
            int indexOf = arrayList.indexOf(obj2);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            if (this.f34915e) {
                h0();
            }
            if (i10 >= 0) {
                if (z10) {
                    ((MediaController.PhotoEntry) obj).reset();
                } else if (obj instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj).reset();
                }
                this.f34940x0.W(i10);
            }
            return indexOf;
        }
        hashMap.put(obj2, obj);
        arrayList.add(obj2);
        return -1;
    }

    public final void Z() {
        this.f34925n.clear();
        zq0 zq0Var = this.L;
        if (zq0Var != null) {
            zq0Var.l();
        }
        this.N.e(false, true);
        c0();
    }

    public final void a0(View view, Object obj) {
        boolean z10;
        int i10 = 1;
        if (Y(-1, obj) == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).b(this.f34912c.contains(Integer.valueOf(this.J.photos.get(((Integer) view.getTag()).intValue()).imageId)), true);
        }
        if (!z10) {
            i10 = 2;
        }
        i0(i10);
        this.f34933s0.a();
    }

    public final void b0(EditText editText) {
        boolean z10;
        if (editText.getText().length() == 0) {
            return;
        }
        String obj = editText.getText().toString();
        this.f34917f.clear();
        this.h.clear();
        this.f34932s = true;
        if (this.f34908a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        d0(obj, "", z10, true);
        this.v = obj;
        if (obj.length() == 0) {
            this.v = null;
            this.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        } else {
            this.N.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, this.v));
        }
        j0();
    }

    public final void c0() {
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt("count", this.f34925n.size());
        int size = this.f34925n.size();
        for (int i10 = 0; i10 < size; i10++) {
            edit.putString(i2.g.i(i10, "recent"), (String) this.f34925n.get(i10));
        }
        edit.commit();
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        this.Y = false;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = this.f34935u0;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = this.f34936v0;
        kVar2.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i11, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, this.f34938w0, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i12 = this.f34908a;
        MediaController.AlbumEntry albumEntry = this.J;
        if (albumEntry != null) {
            this.actionBar.setTitle(albumEntry.bucketName);
        } else if (i12 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchImagesTitle));
        } else if (i12 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchGifsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 16));
        if (this.f34924l0) {
            org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            a2.setSubMenuDelegate(new rq0(this));
            this.Q = a2.e(1, R.drawable.msg_list, LocaleController.getString(R.string.ShowAsList));
            a2.e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        }
        if (albumEntry == null) {
            org.telegram.ui.ActionBar.v0 a10 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a10.F();
            a10.H = new sq0(this);
            this.P = a10;
            EditTextBoldCursor searchField = a10.getSearchField();
            searchField.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            searchField.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vd, false));
        }
        if (albumEntry == null) {
            if (i12 == 0) {
                this.P.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
            } else if (i12 == 1) {
                this.P.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
            }
        }
        tq0 tq0Var = new tq0(this, context);
        this.f34918f0 = tq0Var;
        tq0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.fragmentView = this.f34918f0;
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.K = ll0Var;
        ll0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
        this.K.setClipToPadding(false);
        this.K.setHorizontalScrollBarEnabled(false);
        this.K.setVerticalScrollBarEnabled(false);
        this.K.setItemAnimator(null);
        this.K.setLayoutAnimation(null);
        org.telegram.ui.Components.ll0 ll0Var2 = this.K;
        ?? sVar = new s4.s(4);
        this.M = sVar;
        ll0Var2.setLayoutManager(sVar);
        this.M.O = new vq0(this);
        this.f34918f0.addView(this.K, w7.x5.e(-1, -1, 51));
        org.telegram.ui.Components.ll0 ll0Var3 = this.K;
        zq0 zq0Var = new zq0(this, context);
        this.L = zq0Var;
        ll0Var3.setAdapter(zq0Var);
        this.K.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.K.setOnItemClickListener(new i(this, 21));
        if (this.H != 1) {
            this.K.setOnItemLongClickListener(new oq0(this, 2));
        }
        org.telegram.ui.Components.nl0 nl0Var = new org.telegram.ui.Components.nl0(new wq0(this));
        this.V = nl0Var;
        if (this.H != 1) {
            this.K.E.add(nl0Var);
        }
        xq0 xq0Var = new xq0(context, 0, getResourceProvider());
        this.O = xq0Var;
        xq0Var.setAlpha(0.0f);
        this.O.setVisibility(8);
        org.telegram.ui.Components.xw0 xw0Var = new org.telegram.ui.Components.xw0(context, this.O, 1, getResourceProvider());
        this.N = xw0Var;
        xw0Var.setAnimateLayoutChange(true);
        this.N.d.setTypeface(Typeface.DEFAULT);
        this.N.d.setTextSize(1, 16.0f);
        this.N.d.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f21069y6));
        this.N.addView(this.O, 0);
        if (albumEntry != null) {
            this.N.d.setText(LocaleController.getString(R.string.NoPhotos));
        } else {
            this.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        }
        this.N.e(false, false);
        this.f34918f0.addView(this.N, w7.x5.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.K.setOnScrollListener(new pq0(this));
        if (albumEntry == null) {
            j0();
        }
        if (this.f34929q0) {
            View view = new View(context);
            this.f34913c0 = view;
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            this.f34913c0.setTranslationY(AndroidUtilities.dp(48.0f));
            this.f34918f0.addView(this.f34913c0, w7.x5.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.Z = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            this.Z.setVisibility(4);
            this.Z.setTranslationY(AndroidUtilities.dp(48.0f));
            this.f34918f0.addView(this.Z, w7.x5.e(-1, 48, 83));
            this.Z.setOnTouchListener(new ci.d(2));
            org.telegram.ui.Components.hu huVar = this.f34914d0;
            if (huVar != null) {
                huVar.o();
            }
            this.f34914d0 = new org.telegram.ui.Components.hu(context, this.f34918f0, null, 1, false, null);
            this.f34914d0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
            this.f34914d0.setHint(LocaleController.getString(R.string.AddCaption));
            this.f34914d0.s();
            org.telegram.ui.Components.zt editText = this.f34914d0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.Z.addView(this.f34914d0, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f34914d0.setText(charSequence);
            }
            this.f34914d0.getEditText().addTextChangedListener(new l0(this, 14));
            j0 j0Var = new j0(this, context, 17);
            this.f34909a0 = j0Var;
            j0Var.setFocusable(true);
            this.f34909a0.setFocusableInTouchMode(true);
            this.f34909a0.setVisibility(4);
            this.f34909a0.setScaleX(0.2f);
            this.f34909a0.setScaleY(0.2f);
            this.f34909a0.setAlpha(0.0f);
            this.f34918f0.addView(this.f34909a0, w7.x5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f34916e0 = new ImageView(context);
            this.f34916e0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.S5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.T5, false)));
            this.f34916e0.setImageResource(R.drawable.attach_send);
            this.f34916e0.setImportantForAccessibility(2);
            this.f34916e0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U5, false), PorterDuff.Mode.MULTIPLY));
            this.f34916e0.setScaleType(ImageView.ScaleType.CENTER);
            this.f34916e0.setOutlineProvider(new bi.z1(18));
            this.f34909a0.addView(this.f34916e0, w7.x5.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f34916e0.setOnClickListener(new l60(this, 18));
            this.f34916e0.setOnLongClickListener(new u(this, 4));
            TextPaint textPaint = this.f34920h0;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            t50 t50Var = new t50(this, context, 3);
            this.f34911b0 = t50Var;
            t50Var.setAlpha(0.0f);
            this.f34911b0.setScaleX(0.2f);
            this.f34911b0.setScaleY(0.2f);
            this.f34918f0.addView(this.f34911b0, w7.x5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.T != 0) {
                this.f34914d0.setVisibility(8);
            }
        }
        if ((albumEntry != null || i12 == 0 || i12 == 1) && this.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34915e = z10;
        this.K.setEmptyView(this.N);
        org.telegram.ui.Components.ll0 ll0Var4 = this.K;
        ll0Var4.Y1 = true;
        ll0Var4.Z1 = 0;
        i0(0);
        return this.fragmentView;
    }

    public final void d0(String str, String str2, boolean z10, boolean z11) {
        String str3;
        String str4;
        String str5;
        if (this.f34930r) {
            this.f34930r = false;
            if (this.f34939x != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f34939x, true);
                this.f34939x = 0;
            }
        }
        this.G = str;
        this.f34930r = true;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
        if (z10) {
            str3 = messagesController2.gifSearchBot;
        } else {
            str3 = messagesController2.imageSearchBot;
        }
        TLObject userOrChat = messagesController.getUserOrChat(str3);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (z11 && !this.F) {
                this.F = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                MessagesController messagesController3 = MessagesController.getInstance(this.currentAccount);
                if (z10) {
                    str5 = messagesController3.gifSearchBot;
                } else {
                    str5 = messagesController3.imageSearchBot;
                }
                tL_contacts_resolveUsername.username = str5;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new di.u3(11, this, z10));
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
        co coVar = this.U;
        if (coVar != null) {
            long a2 = coVar.a();
            if (DialogObject.isEncryptedDialog(a2)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().getInputPeer(a2);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i10 = this.f34941y + 1;
        this.f34941y = i10;
        this.f34939x = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.qb(this, str, i10, z10, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.f34939x, this.classGuid);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    public final void e0(int i10, boolean z10) {
        HashMap hashMap = this.f34910b;
        if (!hashMap.isEmpty() && this.f34933s0 != null && !this.S) {
            org.telegram.ui.Components.hu huVar = this.f34914d0;
            if (huVar != null && huVar.f26874a.length() > 0) {
                Object obj = hashMap.get(this.f34912c.get(0));
                if (obj instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj).caption = this.f34914d0.getText().toString();
                } else if (obj instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj).caption = this.f34914d0.getText().toString();
                }
            }
            this.S = true;
            this.f34933s0.h(i10, false, z10);
            if (this.T != 2) {
                ar0 ar0Var = this.f34933s0;
                if (ar0Var == null || ar0Var.e()) {
                    finishFragment();
                }
            }
        }
    }

    public final void f0(int i10, boolean z10) {
        this.H = i10;
        this.I = z10;
        if (i10 > 0 && this.f34908a == 1) {
            this.H = 1;
        }
    }

    public final boolean g0(boolean z10, boolean z11) {
        boolean z12;
        Integer num;
        float f7;
        float f10;
        float f11;
        float f12;
        float dp;
        float f13;
        float f14;
        float f15;
        float f16;
        float dp2;
        if (this.f34914d0 != null) {
            if (this.Z.getTag() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10 != z12) {
                AnimatorSet animatorSet = this.f34923k0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                FrameLayout frameLayout = this.Z;
                if (z10) {
                    num = 1;
                } else {
                    num = null;
                }
                frameLayout.setTag(num);
                if (this.f34914d0.getEditText().isFocused()) {
                    AndroidUtilities.hideKeyboard(this.f34914d0.getEditText());
                }
                this.f34914d0.k(true);
                if (z10) {
                    this.Z.setVisibility(0);
                    this.f34909a0.setVisibility(0);
                }
                float f17 = 0.0f;
                float f18 = 0.2f;
                float f19 = 1.0f;
                if (z11) {
                    this.f34923k0 = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    j0 j0Var = this.f34909a0;
                    Property property = View.SCALE_X;
                    if (z10) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(j0Var, property, f13));
                    j0 j0Var2 = this.f34909a0;
                    Property property2 = View.SCALE_Y;
                    if (z10) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(j0Var2, property2, f14));
                    j0 j0Var3 = this.f34909a0;
                    Property property3 = View.ALPHA;
                    if (z10) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(j0Var3, property3, f15));
                    t50 t50Var = this.f34911b0;
                    if (z10) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.2f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(t50Var, property, f16));
                    t50 t50Var2 = this.f34911b0;
                    if (z10) {
                        f18 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(t50Var2, property2, f18));
                    t50 t50Var3 = this.f34911b0;
                    if (!z10) {
                        f19 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(t50Var3, property3, f19));
                    FrameLayout frameLayout2 = this.Z;
                    Property property4 = View.TRANSLATION_Y;
                    if (z10) {
                        dp2 = 0.0f;
                    } else {
                        dp2 = AndroidUtilities.dp(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property4, dp2));
                    View view = this.f34913c0;
                    if (!z10) {
                        f17 = AndroidUtilities.dp(48.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(view, property4, f17));
                    this.f34923k0.playTogether(arrayList);
                    this.f34923k0.setInterpolator(new DecelerateInterpolator());
                    this.f34923k0.setDuration(180L);
                    this.f34923k0.addListener(new e50(4, this, z10));
                    this.f34923k0.start();
                    return true;
                }
                j0 j0Var4 = this.f34909a0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.2f;
                }
                j0Var4.setScaleX(f7);
                j0 j0Var5 = this.f34909a0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                j0Var5.setScaleY(f10);
                j0 j0Var6 = this.f34909a0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                j0Var6.setAlpha(f11);
                t50 t50Var4 = this.f34911b0;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.2f;
                }
                t50Var4.setScaleX(f12);
                t50 t50Var5 = this.f34911b0;
                if (z10) {
                    f18 = 1.0f;
                }
                t50Var5.setScaleY(f18);
                t50 t50Var6 = this.f34911b0;
                if (!z10) {
                    f19 = 0.0f;
                }
                t50Var6.setAlpha(f19);
                FrameLayout frameLayout3 = this.Z;
                if (z10) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(48.0f);
                }
                frameLayout3.setTranslationY(dp);
                View view2 = this.f34913c0;
                if (!z10) {
                    f17 = AndroidUtilities.dp(48.0f);
                }
                view2.setTranslationY(f17);
                if (!z10) {
                    this.Z.setVisibility(4);
                    this.f34909a0.setVisibility(4);
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34918f0, 1, null, null, null, null, this.f34935u0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, this.f34935u0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, this.f34936v0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, this.f34936v0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, this.f34938w0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, this.f34936v0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.Vd));
        org.telegram.ui.ActionBar.v0 v0Var = this.P;
        if (v0Var != null) {
            editTextBoldCursor = v0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 16777216, null, null, null, null, this.f34936v0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 32768, null, null, null, null, this.f34935u0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.R4}, null, org.telegram.ui.ActionBar.j6.f20694da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.j6.X9));
        return arrayList;
    }

    public final void h0() {
        boolean z10;
        if (this.f34915e) {
            int childCount = this.K.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.K.getChildAt(i10);
                boolean z11 = childAt instanceof org.telegram.ui.Cells.s5;
                MediaController.AlbumEntry albumEntry = this.J;
                ArrayList arrayList = this.f34912c;
                if (z11) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    int i11 = -1;
                    if (albumEntry != null) {
                        MediaController.PhotoEntry photoEntry = albumEntry.photos.get(num.intValue());
                        if (this.f34915e) {
                            i11 = arrayList.indexOf(Integer.valueOf(photoEntry.imageId));
                        }
                        s5Var.setNum(i11);
                    } else {
                        MediaController.SearchImage searchImage = (MediaController.SearchImage) this.f34917f.get(num.intValue());
                        if (this.f34915e) {
                            i11 = arrayList.indexOf(searchImage.f17101id);
                        }
                        s5Var.setNum(i11);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                    if (arrayList.indexOf(Integer.valueOf(albumEntry.photos.get(((Integer) childAt.getTag()).intValue()).imageId)) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j7Var.b(z10, false);
                }
            }
        }
    }

    public final void i0(int i10) {
        boolean z10;
        float f7;
        boolean z11 = true;
        if (this.f34910b.size() == 0) {
            this.f34911b0.setPivotX(0.0f);
            this.f34911b0.setPivotY(0.0f);
            if (i10 == 0) {
                z11 = false;
            }
            g0(false, z11);
            return;
        }
        this.f34911b0.invalidate();
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!g0(true, z10) && i10 != 0) {
            this.f34911b0.setPivotX(AndroidUtilities.dp(21.0f));
            this.f34911b0.setPivotY(AndroidUtilities.dp(12.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            t50 t50Var = this.f34911b0;
            Property property = View.SCALE_X;
            float f10 = 0.9f;
            if (i10 == 1) {
                f7 = 1.1f;
            } else {
                f7 = 0.9f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t50Var, property, f7, 1.0f);
            t50 t50Var2 = this.f34911b0;
            Property property2 = View.SCALE_Y;
            if (i10 == 1) {
                f10 = 1.1f;
            }
            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(t50Var2, property2, f10, 1.0f));
            animatorSet.setInterpolator(new OvershootInterpolator());
            animatorSet.setDuration(180L);
            animatorSet.start();
            return;
        }
        this.f34911b0.setPivotX(0.0f);
        this.f34911b0.setPivotY(0.0f);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20634a7, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void j0() {
        String str;
        zq0 zq0Var = this.L;
        if (zq0Var != null) {
            zq0Var.l();
        }
        if (!this.f34930r && (this.f34925n.size() <= 0 || ((str = this.v) != null && !TextUtils.isEmpty(str)))) {
            this.N.e(false, true);
        } else {
            this.N.e(true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.hu huVar = this.f34914d0;
        if (huVar != null && huVar.f26877e) {
            if (z10) {
                huVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        if (this.f34939x != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f34939x, true);
            this.f34939x = 0;
        }
        org.telegram.ui.Components.hu huVar = this.f34914d0;
        if (huVar != null) {
            huVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPanTranslationUpdate(float f7) {
        org.telegram.ui.Components.ll0 ll0Var = this.K;
        if (ll0Var == null) {
            return;
        }
        if (this.f34914d0.f26877e) {
            this.fragmentView.setTranslationY(f7);
            this.K.setTranslationY(0.0f);
            return;
        }
        ll0Var.setTranslationY(f7);
    }

    @Override
    public final void onResume() {
        super.onResume();
        zq0 zq0Var = this.L;
        if (zq0Var != null) {
            zq0Var.l();
        }
        org.telegram.ui.Components.hu huVar = this.f34914d0;
        if (huVar != null) {
            huVar.s();
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.P;
        if (v0Var != null) {
            v0Var.z(true);
            if (!TextUtils.isEmpty(this.f34928p0)) {
                this.P.H(this.f34928p0, false);
                this.f34928p0 = null;
                b0(this.P.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.v0 v0Var;
        if (z10 && (v0Var = this.P) != null) {
            AndroidUtilities.showKeyboard(v0Var.getSearchField());
        }
    }
}
