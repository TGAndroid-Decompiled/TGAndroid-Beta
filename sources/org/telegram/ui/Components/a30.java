package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

public final class a30 extends View {
    public static final TextPaint F = new TextPaint(1);
    public static final Paint G = new Paint(1);
    public long A;
    public final int[] B;
    public final org.telegram.ui.ActionBar.c6 C;
    public final boolean D;
    public final boolean E;

    public final String f26608a;

    public final long f26609b;

    public final String f26610c;
    public final boolean d;

    public final Drawable f26611e;

    public final RectF f26612f;
    public final ImageReceiver h;

    public final StaticLayout f26613n;

    public final y8 f26614r;

    public final ContactsController.Contact f26615s;
    public final int v;

    public final float f26616w;

    public float f26617x;

    public boolean f26618y;

    public a30(Context context, Object obj) {
        this(context, obj, null, false, null);
    }

    public final void a() {
        if (this.f26618y) {
            this.f26618y = false;
            this.A = System.currentTimeMillis();
            invalidate();
        }
    }

    public final void b() {
        if (this.f26618y) {
            return;
        }
        this.f26618y = true;
        this.A = System.currentTimeMillis();
        invalidate();
    }

    public final void c() {
        int iB = this.f26614r.b();
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.C;
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.05f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.di, c6Var);
        int iRed = Color.red(iL1);
        int[] iArr = this.B;
        iArr[0] = iRed;
        iArr[1] = Color.red(iB);
        iArr[2] = Color.green(iL1);
        iArr[3] = Color.green(iB);
        iArr[4] = Color.blue(iL1);
        iArr[5] = Color.blue(iB);
        iArr[6] = Color.alpha(iL1);
        iArr[7] = Color.alpha(iB);
        this.f26611e.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.MULTIPLY));
        G.setColor(iL1);
    }

    public ContactsController.Contact getContact() {
        return this.f26615s;
    }

    public String getCountryIso2() {
        return this.f26608a;
    }

    public String getKey() {
        return this.f26610c;
    }

    public long getUid() {
        return this.f26609b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f26618y;
        if ((z10 && this.f26617x != 1.0f) || (!z10 && this.f26617x != 0.0f)) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.A;
            if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 17) {
                jCurrentTimeMillis = 17;
            }
            if (this.f26618y) {
                float f10 = (jCurrentTimeMillis / 120.0f) + this.f26617x;
                this.f26617x = f10;
                if (f10 >= 1.0f) {
                    this.f26617x = 1.0f;
                }
            } else {
                float f11 = this.f26617x - (jCurrentTimeMillis / 120.0f);
                this.f26617x = f11;
                if (f11 < 0.0f) {
                    this.f26617x = 0.0f;
                }
            }
            invalidate();
        }
        canvas.save();
        float measuredWidth = getMeasuredWidth();
        boolean z11 = this.D;
        float fDp = AndroidUtilities.dp(z11 ? 28.0f : 32.0f);
        RectF rectF = this.f26612f;
        rectF.set(0.0f, 0.0f, measuredWidth, fDp);
        int[] iArr = this.B;
        int i10 = iArr[6];
        float f12 = iArr[7] - i10;
        float f13 = this.f26617x;
        int i11 = i10 + ((int) (f12 * f13));
        int i12 = iArr[0];
        int i13 = i12 + ((int) ((iArr[1] - i12) * f13));
        int i14 = iArr[2];
        int i15 = i14 + ((int) ((iArr[3] - i14) * f13));
        int i16 = iArr[4];
        int iArgb = Color.argb(i11, i13, i15, i16 + ((int) ((iArr[5] - i16) * f13)));
        Paint paint = G;
        paint.setColor(iArgb);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(z11 ? 14.0f : 16.0f), AndroidUtilities.dp(z11 ? 14.0f : 16.0f), paint);
        if (this.f26617x != 1.0f) {
            this.h.draw(canvas);
        }
        if (this.f26617x != 0.0f) {
            int iB = this.f26614r.b();
            float fAlpha = Color.alpha(iB) / 255.0f;
            paint.setColor(iB);
            paint.setAlpha((int) (this.f26617x * 255.0f * fAlpha));
            canvas.drawCircle(AndroidUtilities.dp(z11 ? 14.0f : 16.0f), AndroidUtilities.dp(z11 ? 14.0f : 16.0f), AndroidUtilities.dp(z11 ? 14.0f : 16.0f), paint);
            canvas.save();
            canvas.rotate((1.0f - this.f26617x) * 45.0f, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            int iDp = AndroidUtilities.dp(z11 ? 9.0f : 11.0f);
            int iDp2 = AndroidUtilities.dp(z11 ? 9.0f : 11.0f);
            int iDp3 = AndroidUtilities.dp(z11 ? 19.0f : 21.0f);
            int iDp4 = AndroidUtilities.dp(z11 ? 19.0f : 21.0f);
            Drawable drawable = this.f26611e;
            drawable.setBounds(iDp, iDp2, iDp3, iDp4);
            drawable.setAlpha((int) (this.f26617x * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        canvas.translate(this.f26616w + AndroidUtilities.dp((z11 ? 26 : 32) + 9), AndroidUtilities.dp(z11 ? 6.0f : 8.0f));
        int i17 = org.telegram.ui.ActionBar.g6.bi;
        org.telegram.ui.ActionBar.c6 c6Var = this.C;
        F.setColor(i0.b.d(this.f26617x, org.telegram.ui.ActionBar.g6.v0(i17, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J7, c6Var)));
        this.f26613n.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f26613n.getText());
        if (this.f26618y) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), LocaleController.getString(R.string.Delete)));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = this.D;
        setMeasuredDimension(AndroidUtilities.dp((z10 ? 20 : 32) + 25) + this.v, AndroidUtilities.dp(z10 ? 28.0f : 32.0f));
    }

    public a30(Context context, Object obj, ContactsController.Contact contact, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        String str;
        String string;
        ImageLocation forUserOrChat;
        TLRPC.User user;
        TLRPC.User user2;
        ImageReceiver imageReceiver;
        float fDp;
        float f10;
        int iX;
        StaticLayout staticLayout;
        super(context);
        this.f26612f = new RectF();
        this.B = new int[8];
        this.E = true;
        this.C = c6Var;
        this.D = z10;
        this.d = false;
        this.f26615s = contact;
        this.f26611e = getResources().getDrawable(R.drawable.delete);
        float fDp2 = AndroidUtilities.dp(z10 ? 13.0f : 14.0f);
        TextPaint textPaint = F;
        textPaint.setTextSize(fDp2);
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        this.f26614r = y8Var;
        y8Var.u(AndroidUtilities.dp(20.0f));
        boolean z11 = obj instanceof String;
        if (!z11) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user3 = (TLRPC.User) obj;
                this.f26609b = user3.f22527id;
                if (UserObject.isReplyUser(user3)) {
                    string = LocaleController.getString(R.string.RepliesTitle);
                    y8Var.f34858p = 0.8f;
                    y8Var.g(12);
                } else {
                    if (UserObject.isUserSelf(user3)) {
                        string = LocaleController.getString(R.string.SavedMessages);
                        y8Var.f34858p = 0.8f;
                        y8Var.g(1);
                    } else {
                        y8Var.r(user3);
                        String firstName = UserObject.getFirstName(user3);
                        int iIndexOf = firstName.indexOf(32);
                        firstName = iIndexOf >= 0 ? firstName.substring(0, iIndexOf) : firstName;
                        forUserOrChat = ImageLocation.getForUserOrChat(user3, 1);
                        String str2 = firstName;
                        user2 = user3;
                        string = str2;
                    }
                    user = user2;
                }
                user2 = null;
                forUserOrChat = null;
                user = user2;
            } else if (obj instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                y8Var.q(chat);
                this.f26609b = -chat.f22380id;
                String str3 = chat.title;
                forUserOrChat = ImageLocation.getForUserOrChat(chat, 1);
                user = chat;
                string = str3;
            } else if (obj instanceof TLRPC.TL_help_country) {
                TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                String languageFlag = LocaleController.getLanguageFlag(tL_help_country.iso2);
                String str4 = tL_help_country.default_name;
                y8Var.g(17);
                y8Var.u(AndroidUtilities.dp(24.0f));
                str = "premium";
                y8Var.o(0L, languageFlag, null, null, null);
                y8Var.h(org.telegram.ui.ActionBar.g6.l1(0.7f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23269p7, c6Var)));
                this.E = false;
                y8Var.f34864w = false;
                this.f26609b = tL_help_country.default_name.hashCode();
                this.f26608a = tL_help_country.iso2;
                string = str4;
            } else {
                str = "premium";
                y8Var.n(contact.contact_id, contact.first_name, contact.last_name);
                this.f26609b = contact.contact_id;
                this.f26610c = contact.key;
                string = !TextUtils.isEmpty(contact.first_name) ? contact.first_name : contact.last_name;
            }
            str = "premium";
            imageReceiver = new ImageReceiver();
            this.h = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
            imageReceiver.setParentView(this);
            if (this.E) {
                fDp = 0.0f;
            } else {
                fDp = AndroidUtilities.dp(4.0f);
            }
            if (z10) {
                f10 = 28.0f;
            } else {
                f10 = 32.0f;
            }
            imageReceiver.setImageCoords(fDp, 0.0f, AndroidUtilities.dp(f10), AndroidUtilities.dp(z10 ? 28.0f : 32.0f));
            if (AndroidUtilities.isTablet()) {
                iX = AndroidUtilities.dp(398 - (z10 ? 28 : 32)) / 2;
            } else {
                Point point = AndroidUtilities.displaySize;
                iX = org.telegram.messenger.rl.x((z10 ? 28 : 32) + 132, Math.min(point.x, point.y), 2);
            }
            staticLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(string.replace('\n', ' '), textPaint.getFontMetricsInt(), false), textPaint, iX, TextUtils.TruncateAt.END), textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f26613n = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.v = (int) Math.ceil(staticLayout.getLineWidth(0));
                this.f26616w = -staticLayout.getLineLeft(0);
            }
            if (!z11 && str.equals((String) obj)) {
                imageReceiver.setImageBitmap(org.telegram.ui.Cells.d4.b(getContext(), true));
            } else if (z11 || !"miniapps".equals((String) obj)) {
                imageReceiver.setImage(forUserOrChat, "50_50", y8Var, 0L, (String) null, user, 1);
            } else {
                getContext();
                imageReceiver.setImageBitmap(org.telegram.ui.Cells.d4.a(true));
            }
            c();
            NotificationCenter.listenEmojiLoading(this);
        }
        String str5 = (String) obj;
        y8Var.f34858p = 0.8f;
        switch (str5.hashCode()) {
            case -1716307998:
                str5.equals("archived");
                y8Var.g(11);
                this.f26609b = -9223372036854775801L;
                string = LocaleController.getString(R.string.FilterArchived);
                break;
            case -1359418551:
                if (!str5.equals("miniapps")) {
                    y8Var.g(11);
                    this.f26609b = -9223372036854775801L;
                    string = LocaleController.getString(R.string.FilterArchived);
                } else {
                    this.d = true;
                    y8Var.i(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.T7, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23000a8, c6Var));
                    string = LocaleController.getString(R.string.PrivacyMiniapps);
                }
                break;
            case -1237460524:
                if (!str5.equals("groups")) {
                    y8Var.g(11);
                    this.f26609b = -9223372036854775801L;
                    string = LocaleController.getString(R.string.FilterArchived);
                } else {
                    y8Var.g(6);
                    this.f26609b = -9223372036854775806L;
                    string = LocaleController.getString(R.string.FilterGroups);
                }
                break;
            case -1197490811:
                if (!str5.equals("non_contacts")) {
                    y8Var.g(11);
                    this.f26609b = -9223372036854775801L;
                    string = LocaleController.getString(R.string.FilterArchived);
                } else {
                    y8Var.g(5);
                    this.f26609b = -9223372036854775807L;
                    string = LocaleController.getString(R.string.FilterNonContacts);
                }
                break;
            case -567451565:
                if (!str5.equals("contacts")) {
                    y8Var.g(11);
                    this.f26609b = -9223372036854775801L;
                    string = LocaleController.getString(R.string.FilterArchived);
                } else {
                    y8Var.g(4);
                    this.f26609b = Long.MIN_VALUE;
                    string = LocaleController.getString(R.string.FilterContacts);
                }
                break;
            case -318452137:
                if (!str5.equals("premium")) {
                    y8Var.g(11);
                    this.f26609b = -9223372036854775801L;
                    string = LocaleController.getString(R.string.FilterArchived);
                } else {
                    this.d = true;
                    y8Var.h(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qj, c6Var));
                    string = LocaleController.getString(R.string.PrivacyPremium);
                }
                break;
            case -268161860:
                if (!str5.equals("new_chats")) {
                    y8Var.g(11);
                    this.f26609b = -9223372036854775801L;
                    string = LocaleController.getString(R.string.FilterArchived);
                } else {
                    y8Var.g(24);
                    this.f26609b = -9223372036854775799L;
                    string = LocaleController.getString(R.string.FilterNewChats);
                }
                break;
            case 3029900:
                if (!str5.equals("bots")) {
                    y8Var.g(11);
                    this.f26609b = -9223372036854775801L;
                    string = LocaleController.getString(R.string.FilterArchived);
                } else {
                    y8Var.g(8);
                    this.f26609b = -9223372036854775804L;
                    string = LocaleController.getString(R.string.FilterBots);
                }
                break;
            case 3496342:
                if (!str5.equals("read")) {
                    y8Var.g(11);
                    this.f26609b = -9223372036854775801L;
                    string = LocaleController.getString(R.string.FilterArchived);
                } else {
                    y8Var.g(10);
                    this.f26609b = -9223372036854775802L;
                    string = LocaleController.getString(R.string.FilterRead);
                }
                break;
            case 104264043:
                if (!str5.equals("muted")) {
                    y8Var.g(11);
                    this.f26609b = -9223372036854775801L;
                    string = LocaleController.getString(R.string.FilterArchived);
                } else {
                    y8Var.g(9);
                    this.f26609b = -9223372036854775803L;
                    string = LocaleController.getString(R.string.FilterMuted);
                }
                break;
            case 151051367:
                if (!str5.equals("existing_chats")) {
                    y8Var.g(11);
                    this.f26609b = -9223372036854775801L;
                    string = LocaleController.getString(R.string.FilterArchived);
                } else {
                    y8Var.g(23);
                    this.f26609b = -9223372036854775800L;
                    string = LocaleController.getString(R.string.FilterExistingChats);
                }
                break;
            case 1432626128:
                if (!str5.equals("channels")) {
                    y8Var.g(11);
                    this.f26609b = -9223372036854775801L;
                    string = LocaleController.getString(R.string.FilterArchived);
                } else {
                    y8Var.g(7);
                    this.f26609b = -9223372036854775805L;
                    string = LocaleController.getString(R.string.FilterChannels);
                }
                break;
            default:
                y8Var.g(11);
                this.f26609b = -9223372036854775801L;
                string = LocaleController.getString(R.string.FilterArchived);
                break;
        }
        str = "premium";
        forUserOrChat = null;
        user = null;
        imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        imageReceiver.setParentView(this);
        if (this.E) {
            fDp = 0.0f;
        } else {
            fDp = AndroidUtilities.dp(4.0f);
        }
        if (z10) {
            f10 = 28.0f;
        } else {
            f10 = 32.0f;
        }
        imageReceiver.setImageCoords(fDp, 0.0f, AndroidUtilities.dp(f10), AndroidUtilities.dp(z10 ? 28.0f : 32.0f));
        if (AndroidUtilities.isTablet()) {
            iX = AndroidUtilities.dp(398 - (z10 ? 28 : 32)) / 2;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            iX = org.telegram.messenger.rl.x((z10 ? 28 : 32) + 132, Math.min(point2.x, point2.y), 2);
        }
        staticLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(string.replace('\n', ' '), textPaint.getFontMetricsInt(), false), textPaint, iX, TextUtils.TruncateAt.END), textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f26613n = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.v = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.f26616w = -staticLayout.getLineLeft(0);
        }
        if (!z11) {
            if (z11) {
                imageReceiver.setImage(forUserOrChat, "50_50", y8Var, 0L, (String) null, user, 1);
            } else {
                imageReceiver.setImage(forUserOrChat, "50_50", y8Var, 0L, (String) null, user, 1);
            }
        } else if (z11) {
            imageReceiver.setImage(forUserOrChat, "50_50", y8Var, 0L, (String) null, user, 1);
        } else {
            imageReceiver.setImage(forUserOrChat, "50_50", y8Var, 0L, (String) null, user, 1);
        }
        c();
        NotificationCenter.listenEmojiLoading(this);
    }
}
