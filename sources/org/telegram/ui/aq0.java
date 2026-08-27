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

public final class aq0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean A;
    public boolean B;
    public String C;
    public int D;
    public boolean E;
    public final MediaController.AlbumEntry F;
    public org.telegram.ui.Components.zk0 G;
    public yp0 H;
    public up0 I;
    public org.telegram.ui.Components.iw0 J;
    public fh.m K;
    public org.telegram.ui.ActionBar.v0 L;
    public org.telegram.ui.ActionBar.f1 M;
    public int N;
    public boolean O;
    public final int P;
    public final rn Q;
    public org.telegram.ui.Components.bl0 R;
    public int S;
    public boolean T;
    public boolean U;
    public FrameLayout V;
    public n0 W;
    public aj0 X;
    public View Y;
    public org.telegram.ui.Components.tt Z;

    public final int f36596a;

    public ImageView f36597a0;

    public final HashMap f36598b;

    public tp0 f36599b0;

    public final ArrayList f36600c;

    public int f36601c0;
    public CharSequence d;

    public final TextPaint f36602d0;

    public boolean f36603e;

    public final RectF f36604e0;

    public final ArrayList f36605f;

    public final Paint f36606f0;

    public AnimatorSet f36607g0;
    public final HashMap h;

    public boolean f36608h0;

    public org.telegram.ui.ActionBar.n1 f36609i0;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout f36610j0;

    public org.telegram.ui.ActionBar.f1[] f36611k0;

    public String f36612l0;
    public boolean m0;

    public final ArrayList f36613n;

    public final boolean f36614n0;

    public zp0 f36615o0;

    public eq0 f36616p0;

    public final int f36617q0;

    public boolean f36618r;

    public final int f36619r0;

    public boolean f36620s;

    public final int f36621s0;

    public final qp0 f36622t0;
    public String v;

    public String f36623w;

    public int f36624x;

    public int f36625y;

    public aq0(int i10, MediaController.AlbumEntry albumEntry, HashMap map, ArrayList arrayList, int i11, boolean z10, rn rnVar, boolean z11) {
        super(null);
        this.f36605f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.f36613n = new ArrayList();
        this.f36620s = true;
        this.E = true;
        this.N = 100;
        this.f36601c0 = 3;
        this.f36602d0 = new TextPaint(1);
        this.f36604e0 = new RectF();
        this.f36606f0 = new Paint(1);
        this.m0 = true;
        this.f36622t0 = new qp0(this);
        this.F = albumEntry;
        this.f36598b = map;
        this.f36600c = arrayList;
        this.f36596a = i10;
        this.P = i11;
        this.Q = rnVar;
        this.A = z10;
        this.f36614n0 = z11;
        if (albumEntry == null) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0);
            int i12 = sharedPreferences.getInt("count", 0);
            for (int i13 = 0; i13 < i12; i13++) {
                String string = sharedPreferences.getString("recent" + i13, null);
                if (string == null) {
                    break;
                }
                this.f36613n.add(string);
            }
        }
        if (z11) {
            this.f36617q0 = org.telegram.ui.ActionBar.g6.f23367ug;
            this.f36619r0 = org.telegram.ui.ActionBar.g6.f23135hg;
            this.f36621s0 = org.telegram.ui.ActionBar.g6.f23153ig;
        } else {
            this.f36617q0 = org.telegram.ui.ActionBar.g6.f23124h5;
            this.f36619r0 = org.telegram.ui.ActionBar.g6.f23161j5;
            this.f36621s0 = org.telegram.ui.ActionBar.g6.I5;
        }
    }

    public static void U(aq0 aq0Var, TLObject tLObject, boolean z10) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(aq0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(aq0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(aq0Var.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = aq0Var.C;
        aq0Var.C = null;
        aq0Var.d0(str, "", z10, false);
    }

    public static org.telegram.ui.Cells.q5 V(aq0 aq0Var, int i10) {
        int childCount = aq0Var.G.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = aq0Var.G.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                int iIntValue = ((Integer) q5Var.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = aq0Var.F;
                if (albumEntry != null) {
                    if (iIntValue >= 0 && iIntValue < albumEntry.photos.size()) {
                        if (iIntValue == i10) {
                            return q5Var;
                        }
                    }
                } else if (iIntValue >= 0 && iIntValue < aq0Var.f36605f.size()) {
                    if (iIntValue == i10) {
                        return q5Var;
                    }
                }
            }
        }
        return null;
    }

    public final int Y(int i10, Object obj) {
        Object objValueOf;
        boolean z10 = obj instanceof MediaController.PhotoEntry;
        if (z10) {
            objValueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else {
            objValueOf = obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).f19616id : null;
        }
        if (objValueOf == null) {
            return -1;
        }
        HashMap map = this.f36598b;
        boolean zContainsKey = map.containsKey(objValueOf);
        ArrayList arrayList = this.f36600c;
        if (!zContainsKey) {
            map.put(objValueOf, obj);
            arrayList.add(objValueOf);
            return -1;
        }
        map.remove(objValueOf);
        int iIndexOf = arrayList.indexOf(objValueOf);
        if (iIndexOf >= 0) {
            arrayList.remove(iIndexOf);
        }
        if (this.f36603e) {
            h0();
        }
        if (i10 >= 0) {
            if (z10) {
                ((MediaController.PhotoEntry) obj).reset();
            } else if (obj instanceof MediaController.SearchImage) {
                ((MediaController.SearchImage) obj).reset();
            }
            this.f36622t0.W(i10);
        }
        return iIndexOf;
    }

    public final void Z() {
        this.f36613n.clear();
        yp0 yp0Var = this.H;
        if (yp0Var != null) {
            yp0Var.l();
        }
        this.J.e(false, true);
        c0();
    }

    public final void a0(View view, Object obj) {
        boolean z10 = Y(-1, obj) == -1;
        if (view instanceof org.telegram.ui.Cells.f7) {
            ((org.telegram.ui.Cells.f7) view).b(this.f36600c.contains(Integer.valueOf(this.F.photos.get(((Integer) view.getTag()).intValue()).imageId)), true);
        }
        i0(z10 ? 1 : 2);
        this.f36615o0.a();
    }

    public final void b0(EditText editText) {
        if (editText.getText().length() == 0) {
            return;
        }
        String string = editText.getText().toString();
        this.f36605f.clear();
        this.h.clear();
        this.f36620s = true;
        d0(string, "", this.f36596a == 1, true);
        this.v = string;
        if (string.length() == 0) {
            this.v = null;
            this.J.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        } else {
            this.J.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, this.v));
        }
        j0();
    }

    public final void c0() {
        SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0).edit();
        editorEdit.clear();
        editorEdit.putInt("count", this.f36613n.size());
        int size = this.f36613n.size();
        for (int i10 = 0; i10 < size; i10++) {
            editorEdit.putString(i0.a.k(i10, "recent"), (String) this.f36613n.get(i10));
        }
        editorEdit.commit();
    }

    @Override
    public final View createView(Context context) {
        this.U = false;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = this.f36617q0;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = this.f36619r0;
        kVar2.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, i11, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, this.f36621s0, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i12 = this.f36596a;
        int i13 = 1;
        MediaController.AlbumEntry albumEntry = this.F;
        if (albumEntry != null) {
            this.actionBar.setTitle(albumEntry.bucketName);
        } else if (i12 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchImagesTitle));
        } else if (i12 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchGifsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 11));
        int i14 = 2;
        if (this.f36608h0) {
            org.telegram.ui.ActionBar.v0 v0VarA = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            v0VarA.setSubMenuDelegate(new rp0(this));
            this.M = v0VarA.e(1, R.drawable.msg_list, LocaleController.getString(R.string.ShowAsList));
            v0VarA.e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        }
        if (albumEntry == null) {
            org.telegram.ui.ActionBar.v0 v0VarA2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            v0VarA2.F();
            v0VarA2.D = new sp0(this);
            this.L = v0VarA2;
            EditTextBoldCursor searchField = v0VarA2.getSearchField();
            searchField.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            searchField.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Vd, false));
        }
        if (albumEntry == null) {
            if (i12 == 0) {
                this.L.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
            } else if (i12 == 1) {
                this.L.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
            }
        }
        tp0 tp0Var = new tp0(this, context);
        this.f36599b0 = tp0Var;
        tp0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.fragmentView = this.f36599b0;
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.G = zk0Var;
        zk0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
        this.G.setClipToPadding(false);
        this.G.setHorizontalScrollBarEnabled(false);
        this.G.setVerticalScrollBarEnabled(false);
        this.G.setItemAnimator(null);
        this.G.setLayoutAnimation(null);
        org.telegram.ui.Components.zk0 zk0Var2 = this.G;
        int i15 = 4;
        up0 up0Var = new up0(4);
        this.I = up0Var;
        zk0Var2.setLayoutManager(up0Var);
        this.I.O = new vp0(this);
        this.f36599b0.addView(this.G, h7.z5.e(-1, -1, 51));
        org.telegram.ui.Components.zk0 zk0Var3 = this.G;
        yp0 yp0Var = new yp0(this, context);
        this.H = yp0Var;
        zk0Var3.setAdapter(yp0Var);
        this.G.setGlowColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.G.setOnItemClickListener(new i(this, 20));
        if (this.D != 1) {
            this.G.setOnItemLongClickListener(new np0(this, i14));
        }
        org.telegram.ui.Components.bl0 bl0Var = new org.telegram.ui.Components.bl0(new wp0(this));
        this.R = bl0Var;
        if (this.D != 1) {
            this.G.A.add(bl0Var);
        }
        fh.m mVar = new fh.m(context, i13, getResourceProvider());
        this.K = mVar;
        mVar.setAlpha(0.0f);
        this.K.setVisibility(8);
        org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(context, this.K, 1, getResourceProvider());
        this.J = iw0Var;
        iw0Var.setAnimateLayoutChange(true);
        this.J.d.setTypeface(Typeface.DEFAULT);
        this.J.d.setTextSize(1, 16.0f);
        this.J.d.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23423y6));
        this.J.addView(this.K, 0);
        if (albumEntry != null) {
            this.J.d.setText(LocaleController.getString(R.string.NoPhotos));
        } else {
            this.J.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        }
        this.J.e(false, false);
        this.f36599b0.addView(this.J, h7.z5.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.G.setOnScrollListener(new pp0(this));
        if (albumEntry == null) {
            j0();
        }
        if (this.m0) {
            View view = new View(context);
            this.Y = view;
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            this.Y.setTranslationY(AndroidUtilities.dp(48.0f));
            this.f36599b0.addView(this.Y, h7.z5.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.V = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            this.V.setVisibility(4);
            this.V.setTranslationY(AndroidUtilities.dp(48.0f));
            this.f36599b0.addView(this.V, h7.z5.e(-1, 48, 83));
            this.V.setOnTouchListener(new kh.e(2));
            org.telegram.ui.Components.tt ttVar = this.Z;
            if (ttVar != null) {
                ttVar.o();
            }
            this.Z = new org.telegram.ui.Components.tt(context, this.f36599b0, null, 1, false, null);
            this.Z.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
            this.Z.setHint(LocaleController.getString(R.string.AddCaption));
            this.Z.s();
            org.telegram.ui.Components.lt editText = this.Z.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.V.addView(this.Z, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.Z.setText(charSequence);
            }
            this.Z.getEditText().addTextChangedListener(new p0(this, 14));
            n0 n0Var = new n0(this, context, 17);
            this.W = n0Var;
            n0Var.setFocusable(true);
            this.W.setFocusableInTouchMode(true);
            this.W.setVisibility(4);
            this.W.setScaleX(0.2f);
            this.W.setScaleY(0.2f);
            this.W.setAlpha(0.0f);
            this.f36599b0.addView(this.W, h7.z5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.f36597a0 = new ImageView(context);
            this.f36597a0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.S5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.T5, false)));
            this.f36597a0.setImageResource(R.drawable.attach_send);
            this.f36597a0.setImportantForAccessibility(2);
            this.f36597a0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.U5, false), PorterDuff.Mode.MULTIPLY));
            this.f36597a0.setScaleType(ImageView.ScaleType.CENTER);
            this.f36597a0.setOutlineProvider(new cg.l1(18));
            this.W.addView(this.f36597a0, h7.z5.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.f36597a0.setOnClickListener(new u50(this, 19));
            this.f36597a0.setOnLongClickListener(new v(this, i15));
            float fDp = AndroidUtilities.dp(12.0f);
            TextPaint textPaint = this.f36602d0;
            textPaint.setTextSize(fDp);
            textPaint.setTypeface(AndroidUtilities.bold());
            aj0 aj0Var = new aj0(this, context, i14);
            this.X = aj0Var;
            aj0Var.setAlpha(0.0f);
            this.X.setScaleX(0.2f);
            this.X.setScaleY(0.2f);
            this.f36599b0.addView(this.X, h7.z5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.P != 0) {
                this.Z.setVisibility(8);
            }
        }
        this.f36603e = (albumEntry != null || i12 == 0 || i12 == 1) && this.E;
        this.G.setEmptyView(this.J);
        org.telegram.ui.Components.zk0 zk0Var4 = this.G;
        zk0Var4.U1 = true;
        zk0Var4.V1 = 0;
        i0(0);
        return this.fragmentView;
    }

    public final void d0(String str, String str2, boolean z10, boolean z11) {
        if (this.f36618r) {
            this.f36618r = false;
            if (this.f36624x != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f36624x, true);
                this.f36624x = 0;
            }
        }
        this.C = str;
        this.f36618r = true;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
        TLObject userOrChat = messagesController.getUserOrChat(z10 ? messagesController2.gifSearchBot : messagesController2.imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (!z11 || this.B) {
                return;
            }
            this.B = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            MessagesController messagesController3 = MessagesController.getInstance(this.currentAccount);
            tL_contacts_resolveUsername.username = z10 ? messagesController3.gifSearchBot : messagesController3.imageSearchBot;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new lh.n3(11, this, z10));
            return;
        }
        TLRPC.User user = (TLRPC.User) userOrChat;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = str == null ? "" : str;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        tL_messages_getInlineBotResults.offset = str2;
        rn rnVar = this.Q;
        if (rnVar != null) {
            long jA = rnVar.a();
            if (DialogObject.isEncryptedDialog(jA)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().getInputPeer(jA);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i10 = this.f36625y + 1;
        this.f36625y = i10;
        this.f36624x = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.pb(this, str, i10, z10, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.f36624x, this.classGuid);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    public final void e0(int i10, boolean z10) {
        HashMap map = this.f36598b;
        if (map.isEmpty() || this.f36615o0 == null || this.O) {
            return;
        }
        org.telegram.ui.Components.tt ttVar = this.Z;
        if (ttVar != null && ttVar.f32875a.length() > 0) {
            Object obj = map.get(this.f36600c.get(0));
            if (obj instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) obj).caption = this.Z.getText().toString();
            } else if (obj instanceof MediaController.SearchImage) {
                ((MediaController.SearchImage) obj).caption = this.Z.getText().toString();
            }
        }
        this.O = true;
        this.f36615o0.i(i10, false, z10);
        if (this.P != 2) {
            zp0 zp0Var = this.f36615o0;
            if (zp0Var == null || zp0Var.e()) {
                finishFragment();
            }
        }
    }

    public final void f0(int i10, boolean z10) {
        this.D = i10;
        this.E = z10;
        if (i10 <= 0 || this.f36596a != 1) {
            return;
        }
        this.D = 1;
    }

    public final boolean g0(boolean z10, boolean z11) {
        if (this.Z != null) {
            if (z10 != (this.V.getTag() != null)) {
                AnimatorSet animatorSet = this.f36607g0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.V.setTag(z10 ? 1 : null);
                if (this.Z.getEditText().isFocused()) {
                    AndroidUtilities.hideKeyboard(this.Z.getEditText());
                }
                this.Z.k(true);
                if (z10) {
                    this.V.setVisibility(0);
                    this.W.setVisibility(0);
                }
                int i10 = 4;
                if (!z11) {
                    this.W.setScaleX(z10 ? 1.0f : 0.2f);
                    this.W.setScaleY(z10 ? 1.0f : 0.2f);
                    this.W.setAlpha(z10 ? 1.0f : 0.0f);
                    this.X.setScaleX(z10 ? 1.0f : 0.2f);
                    this.X.setScaleY(z10 ? 1.0f : 0.2f);
                    this.X.setAlpha(z10 ? 1.0f : 0.0f);
                    this.V.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
                    this.Y.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
                    if (!z10) {
                        this.V.setVisibility(4);
                        this.W.setVisibility(4);
                    }
                    return true;
                }
                this.f36607g0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                n0 n0Var = this.W;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property, z10 ? 1.0f : 0.2f));
                n0 n0Var2 = this.W;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(n0Var2, (Property<n0, Float>) property2, z10 ? 1.0f : 0.2f));
                n0 n0Var3 = this.W;
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(n0Var3, (Property<n0, Float>) property3, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.X, (Property<aj0, Float>) property, z10 ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.X, (Property<aj0, Float>) property2, z10 ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.X, (Property<aj0, Float>) property3, z10 ? 1.0f : 0.0f));
                FrameLayout frameLayout = this.V;
                Property property4 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property4, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.Y, (Property<View, Float>) property4, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
                this.f36607g0.playTogether(arrayList);
                this.f36607g0.setInterpolator(new DecelerateInterpolator());
                this.f36607g0.setDuration(180L);
                this.f36607g0.addListener(new n40(i10, this, z10));
                this.f36607g0.start();
                return true;
            }
        }
        return false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36599b0, 1, null, null, null, null, this.f36617q0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, this.f36617q0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, this.f36619r0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, this.f36619r0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, this.f36621s0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, this.f36619r0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.Vd));
        org.telegram.ui.ActionBar.v0 v0Var = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var != null ? v0Var.getSearchField() : null, 16777216, null, null, null, null, this.f36619r0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 32768, null, null, null, null, this.f36617q0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.R4}, null, org.telegram.ui.ActionBar.g6.f23057da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.g6.X9));
        return arrayList;
    }

    public final void h0() {
        if (this.f36603e) {
            int childCount = this.G.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.G.getChildAt(i10);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.q5;
                MediaController.AlbumEntry albumEntry = this.F;
                ArrayList arrayList = this.f36600c;
                if (z10) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    if (albumEntry != null) {
                        q5Var.setNum(this.f36603e ? arrayList.indexOf(Integer.valueOf(albumEntry.photos.get(num.intValue()).imageId)) : -1);
                    } else {
                        q5Var.setNum(this.f36603e ? arrayList.indexOf(((MediaController.SearchImage) this.f36605f.get(num.intValue())).f19616id) : -1);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.f7) {
                    ((org.telegram.ui.Cells.f7) childAt).b(arrayList.indexOf(Integer.valueOf(albumEntry.photos.get(((Integer) childAt.getTag()).intValue()).imageId)) != 0, false);
                }
            }
        }
    }

    public final void i0(int i10) {
        if (this.f36598b.size() == 0) {
            this.X.setPivotX(0.0f);
            this.X.setPivotY(0.0f);
            g0(false, i10 != 0);
            return;
        }
        this.X.invalidate();
        if (g0(true, i10 != 0) || i10 == 0) {
            this.X.setPivotX(0.0f);
            this.X.setPivotY(0.0f);
            return;
        }
        this.X.setPivotX(AndroidUtilities.dp(21.0f));
        this.X.setPivotY(AndroidUtilities.dp(12.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.X, (Property<aj0, Float>) View.SCALE_X, i10 == 1 ? 1.1f : 0.9f, 1.0f), ObjectAnimator.ofFloat(this.X, (Property<aj0, Float>) View.SCALE_Y, i10 == 1 ? 1.1f : 0.9f, 1.0f));
        animatorSet.setInterpolator(new OvershootInterpolator());
        animatorSet.setDuration(180L);
        animatorSet.start();
    }

    @Override
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false)) > 0.721f;
    }

    public final void j0() {
        String str;
        yp0 yp0Var = this.H;
        if (yp0Var != null) {
            yp0Var.l();
        }
        if (this.f36618r || (this.f36613n.size() > 0 && ((str = this.v) == null || TextUtils.isEmpty(str)))) {
            this.J.e(true, true);
        } else {
            this.J.e(false, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.tt ttVar = this.Z;
        if (ttVar == null || !ttVar.f32878e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        ttVar.k(true);
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        if (this.f36624x != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f36624x, true);
            this.f36624x = 0;
        }
        org.telegram.ui.Components.tt ttVar = this.Z;
        if (ttVar != null) {
            ttVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        org.telegram.ui.Components.zk0 zk0Var = this.G;
        if (zk0Var == null) {
            return;
        }
        if (!this.Z.f32878e) {
            zk0Var.setTranslationY(f10);
        } else {
            this.fragmentView.setTranslationY(f10);
            this.G.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        yp0 yp0Var = this.H;
        if (yp0Var != null) {
            yp0Var.l();
        }
        org.telegram.ui.Components.tt ttVar = this.Z;
        if (ttVar != null) {
            ttVar.s();
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.L;
        if (v0Var != null) {
            v0Var.z(true);
            if (!TextUtils.isEmpty(this.f36612l0)) {
                this.L.H(this.f36612l0, false);
                this.f36612l0 = null;
                b0(this.L.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.v0 v0Var;
        if (!z10 || (v0Var = this.L) == null) {
            return;
        }
        AndroidUtilities.showKeyboard(v0Var.getSearchField());
    }
}
