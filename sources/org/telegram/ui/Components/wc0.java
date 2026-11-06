package org.telegram.ui.Components;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wc0 implements DialogInterface.OnClickListener {
    public final ad0 f39952a;

    public wc0(ad0 ad0Var) {
        this.f39952a = ad0Var;
    }

    public static void a(String str, ContentValues contentValues) {
        if (str.startsWith("X-")) {
            contentValues.put("data2", (Integer) 0);
            contentValues.put("data3", str.substring(2));
        } else if ("PREF".equalsIgnoreCase(str)) {
            contentValues.put("data2", (Integer) 12);
        } else if ("HOME".equalsIgnoreCase(str)) {
            contentValues.put("data2", (Integer) 1);
        } else if (!"MOBILE".equalsIgnoreCase(str) && !"CELL".equalsIgnoreCase(str)) {
            if ("OTHER".equalsIgnoreCase(str)) {
                contentValues.put("data2", (Integer) 7);
            } else if ("WORK".equalsIgnoreCase(str)) {
                contentValues.put("data2", (Integer) 3);
            } else if (!"RADIO".equalsIgnoreCase(str) && !"VOICE".equalsIgnoreCase(str)) {
                if ("PAGER".equalsIgnoreCase(str)) {
                    contentValues.put("data2", (Integer) 6);
                } else if ("CALLBACK".equalsIgnoreCase(str)) {
                    contentValues.put("data2", (Integer) 8);
                } else if ("CAR".equalsIgnoreCase(str)) {
                    contentValues.put("data2", (Integer) 9);
                } else if ("ASSISTANT".equalsIgnoreCase(str)) {
                    contentValues.put("data2", (Integer) 19);
                } else if ("MMS".equalsIgnoreCase(str)) {
                    contentValues.put("data2", (Integer) 20);
                } else if (str.startsWith("FAX")) {
                    contentValues.put("data2", (Integer) 4);
                } else {
                    contentValues.put("data2", (Integer) 0);
                    contentValues.put("data3", str);
                }
            } else {
                contentValues.put("data2", (Integer) 14);
            }
        } else {
            contentValues.put("data2", (Integer) 2);
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        Intent intent;
        String str;
        ad0 ad0Var;
        String str2;
        Intent intent2;
        Integer num;
        ArrayList<? extends Parcelable> arrayList;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        String str3;
        String str4;
        ArrayList arrayList2;
        Integer num6;
        String str5;
        Integer num7;
        Integer num8;
        Integer num9 = 7;
        Integer num10 = 5;
        Integer num11 = 4;
        Integer num12 = 6;
        ad0 ad0Var2 = this.f39952a;
        ArrayList arrayList3 = ad0Var2.D1;
        ArrayList arrayList4 = ad0Var2.C1;
        Integer num13 = 0;
        if (i7 == 0) {
            intent = new Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/raw_contact");
        } else if (i7 == 1) {
            intent = new Intent("android.intent.action.INSERT_OR_EDIT");
            intent.setType("vnd.android.cursor.item/contact");
        } else {
            intent = null;
        }
        TLRPC.TL_userContact_old2 tL_userContact_old2 = ad0Var2.E1;
        intent.putExtra("name", org.telegram.messenger.g5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name));
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        int i10 = 0;
        while (true) {
            str = "data1";
            ad0Var = ad0Var2;
            str2 = "mimetype";
            if (i10 >= arrayList3.size()) {
                break;
            }
            org.telegram.messenger.f0 f0Var = (org.telegram.messenger.f0) arrayList3.get(i10);
            int i11 = i10;
            ContentValues contentValues = new ContentValues();
            contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
            contentValues.put("data1", f0Var.c(false));
            a(f0Var.a(false), contentValues);
            arrayList5.add(contentValues);
            i10 = i11 + 1;
            ad0Var2 = ad0Var;
            arrayList3 = arrayList3;
        }
        int i12 = 0;
        boolean z9 = false;
        while (i12 < arrayList4.size()) {
            org.telegram.messenger.f0 f0Var2 = (org.telegram.messenger.f0) arrayList4.get(i12);
            int i13 = i12;
            int i14 = f0Var2.f22311c;
            boolean z10 = z9;
            if (i14 == 1) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(str2, "vnd.android.cursor.item/email_v2");
                intent2 = intent;
                contentValues2.put(str, f0Var2.c(false));
                a(f0Var2.a(false), contentValues2);
                arrayList5.add(contentValues2);
                num = num9;
                num5 = num13;
                num3 = num10;
                num4 = num11;
                num2 = num12;
                str4 = str;
                str3 = str2;
                arrayList2 = arrayList4;
                arrayList = arrayList5;
            } else {
                intent2 = intent;
                ArrayList arrayList6 = arrayList4;
                ArrayList<? extends Parcelable> arrayList7 = arrayList5;
                num = num9;
                if (i14 == 3) {
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put(str2, "vnd.android.cursor.item/website");
                    String str6 = str2;
                    contentValues3.put(str, f0Var2.c(false));
                    String a10 = f0Var2.a(false);
                    if (a10.startsWith("X-")) {
                        contentValues3.put("data2", num13);
                        contentValues3.put("data3", a10.substring(2));
                    } else if ("HOMEPAGE".equalsIgnoreCase(a10)) {
                        contentValues3.put("data2", (Integer) 1);
                    } else if ("BLOG".equalsIgnoreCase(a10)) {
                        contentValues3.put("data2", (Integer) 2);
                    } else if ("PROFILE".equalsIgnoreCase(a10)) {
                        contentValues3.put("data2", (Integer) 3);
                    } else if ("HOME".equalsIgnoreCase(a10)) {
                        contentValues3.put("data2", num11);
                    } else if ("WORK".equalsIgnoreCase(a10)) {
                        contentValues3.put("data2", num10);
                    } else if ("FTP".equalsIgnoreCase(a10)) {
                        contentValues3.put("data2", num12);
                    } else {
                        if ("OTHER".equalsIgnoreCase(a10)) {
                            num8 = num;
                            contentValues3.put("data2", num8);
                        } else {
                            num8 = num;
                            contentValues3.put("data2", num13);
                            contentValues3.put("data3", a10);
                        }
                        arrayList = arrayList7;
                        arrayList.add(contentValues3);
                        num = num8;
                        num5 = num13;
                        num4 = num11;
                        num2 = num12;
                        str4 = str;
                        arrayList2 = arrayList6;
                        str3 = str6;
                        num3 = num10;
                    }
                    arrayList = arrayList7;
                    num8 = num;
                    arrayList.add(contentValues3);
                    num = num8;
                    num5 = num13;
                    num4 = num11;
                    num2 = num12;
                    str4 = str;
                    arrayList2 = arrayList6;
                    str3 = str6;
                    num3 = num10;
                } else {
                    String str7 = str2;
                    arrayList = arrayList7;
                    if (i14 == 4) {
                        ContentValues contentValues4 = new ContentValues();
                        contentValues4.put(str7, "vnd.android.cursor.item/note");
                        contentValues4.put(str, f0Var2.c(false));
                        arrayList.add(contentValues4);
                        num5 = num13;
                        num3 = num10;
                        str3 = str7;
                        num4 = num11;
                        num2 = num12;
                        str4 = str;
                        arrayList2 = arrayList6;
                    } else {
                        num2 = num12;
                        if (i14 == 5) {
                            ContentValues contentValues5 = new ContentValues();
                            contentValues5.put(str7, "vnd.android.cursor.item/contact_event");
                            contentValues5.put(str, f0Var2.c(false));
                            contentValues5.put("data2", (Integer) 3);
                            arrayList.add(contentValues5);
                            num5 = num13;
                            num3 = num10;
                            num4 = num11;
                            str3 = str7;
                            str4 = str;
                            arrayList2 = arrayList6;
                        } else {
                            num3 = num10;
                            num4 = num11;
                            num5 = num13;
                            if (i14 == 2) {
                                ContentValues contentValues6 = new ContentValues();
                                contentValues6.put(str7, "vnd.android.cursor.item/postal-address_v2");
                                String[] b10 = f0Var2.b();
                                String str8 = str;
                                if (b10.length > 0) {
                                    contentValues6.put("data5", b10[0]);
                                }
                                if (b10.length > 1) {
                                    contentValues6.put("data6", b10[1]);
                                }
                                if (b10.length > 2) {
                                    contentValues6.put("data4", b10[2]);
                                }
                                if (b10.length > 3) {
                                    contentValues6.put("data7", b10[3]);
                                }
                                if (b10.length > 4) {
                                    contentValues6.put("data8", b10[4]);
                                }
                                if (b10.length > 5) {
                                    contentValues6.put("data9", b10[5]);
                                }
                                if (b10.length > 6) {
                                    contentValues6.put("data10", b10[6]);
                                }
                                String a11 = f0Var2.a(false);
                                if ("HOME".equalsIgnoreCase(a11)) {
                                    contentValues6.put("data2", (Integer) 1);
                                } else if ("WORK".equalsIgnoreCase(a11)) {
                                    contentValues6.put("data2", (Integer) 2);
                                } else if ("OTHER".equalsIgnoreCase(a11)) {
                                    contentValues6.put("data2", (Integer) 3);
                                }
                                arrayList.add(contentValues6);
                                str3 = str7;
                                arrayList2 = arrayList6;
                                str4 = str8;
                            } else {
                                String str9 = str;
                                if (i14 == 20) {
                                    ContentValues contentValues7 = new ContentValues();
                                    contentValues7.put(str7, "vnd.android.cursor.item/im");
                                    String a12 = f0Var2.a(true);
                                    String a13 = f0Var2.a(false);
                                    str3 = str7;
                                    contentValues7.put(str9, f0Var2.c(false));
                                    if ("AIM".equalsIgnoreCase(a12)) {
                                        num7 = num5;
                                        contentValues7.put("data5", num7);
                                        str5 = str9;
                                    } else {
                                        str5 = str9;
                                        num7 = num5;
                                        if ("MSN".equalsIgnoreCase(a12)) {
                                            contentValues7.put("data5", (Integer) 1);
                                        } else if ("YAHOO".equalsIgnoreCase(a12)) {
                                            contentValues7.put("data5", (Integer) 2);
                                        } else if ("SKYPE".equalsIgnoreCase(a12)) {
                                            contentValues7.put("data5", (Integer) 3);
                                        } else if ("QQ".equalsIgnoreCase(a12)) {
                                            contentValues7.put("data5", num4);
                                        } else if ("GOOGLE-TALK".equalsIgnoreCase(a12)) {
                                            contentValues7.put("data5", num3);
                                        } else if ("ICQ".equalsIgnoreCase(a12)) {
                                            contentValues7.put("data5", num2);
                                        } else if ("JABBER".equalsIgnoreCase(a12)) {
                                            contentValues7.put("data5", num);
                                        } else if ("NETMEETING".equalsIgnoreCase(a12)) {
                                            contentValues7.put("data5", (Integer) 8);
                                        } else {
                                            contentValues7.put("data5", (Integer) (-1));
                                            contentValues7.put("data6", f0Var2.a(true));
                                        }
                                    }
                                    if ("HOME".equalsIgnoreCase(a13)) {
                                        contentValues7.put("data2", (Integer) 1);
                                    } else if ("WORK".equalsIgnoreCase(a13)) {
                                        contentValues7.put("data2", (Integer) 2);
                                    } else if ("OTHER".equalsIgnoreCase(a13)) {
                                        contentValues7.put("data2", (Integer) 3);
                                    }
                                    arrayList.add(contentValues7);
                                    num5 = num7;
                                    arrayList2 = arrayList6;
                                    str4 = str5;
                                } else {
                                    str3 = str7;
                                    Integer num14 = num5;
                                    str4 = str9;
                                    if (i14 != 6 || z10) {
                                        num5 = num14;
                                        arrayList2 = arrayList6;
                                    } else {
                                        ContentValues contentValues8 = new ContentValues();
                                        String str10 = str3;
                                        contentValues8.put(str10, "vnd.android.cursor.item/organization");
                                        int i15 = i13;
                                        while (i15 < arrayList6.size()) {
                                            ArrayList arrayList8 = arrayList6;
                                            org.telegram.messenger.f0 f0Var3 = (org.telegram.messenger.f0) arrayList8.get(i15);
                                            int i16 = i15;
                                            String str11 = str10;
                                            if (f0Var3.f22311c == 6) {
                                                String a14 = f0Var3.a(true);
                                                if ("ORG".equalsIgnoreCase(a14)) {
                                                    String[] b11 = f0Var3.b();
                                                    if (b11.length != 0) {
                                                        num6 = num14;
                                                        if (b11.length >= 1) {
                                                            contentValues8.put(str4, b11[0]);
                                                        }
                                                        if (b11.length >= 2) {
                                                            contentValues8.put("data5", b11[1]);
                                                        }
                                                    }
                                                } else {
                                                    num6 = num14;
                                                    if ("TITLE".equalsIgnoreCase(a14)) {
                                                        contentValues8.put("data4", f0Var3.c(false));
                                                    } else if ("ROLE".equalsIgnoreCase(a14)) {
                                                        contentValues8.put("data4", f0Var3.c(false));
                                                    }
                                                }
                                                String a15 = f0Var3.a(true);
                                                if ("WORK".equalsIgnoreCase(a15)) {
                                                    contentValues8.put("data2", (Integer) 1);
                                                } else if ("OTHER".equalsIgnoreCase(a15)) {
                                                    contentValues8.put("data2", (Integer) 2);
                                                }
                                                i15 = i16 + 1;
                                                arrayList6 = arrayList8;
                                                num14 = num6;
                                                str10 = str11;
                                            }
                                            num6 = num14;
                                            i15 = i16 + 1;
                                            arrayList6 = arrayList8;
                                            num14 = num6;
                                            str10 = str11;
                                        }
                                        str3 = str10;
                                        num5 = num14;
                                        arrayList2 = arrayList6;
                                        arrayList.add(contentValues8);
                                        z9 = true;
                                        i12 = i13 + 1;
                                        arrayList4 = arrayList2;
                                        arrayList5 = arrayList;
                                        intent = intent2;
                                        num12 = num2;
                                        num10 = num3;
                                        num11 = num4;
                                        num13 = num5;
                                        str2 = str3;
                                        str = str4;
                                        num9 = num;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z9 = z10;
            i12 = i13 + 1;
            arrayList4 = arrayList2;
            arrayList5 = arrayList;
            intent = intent2;
            num12 = num2;
            num10 = num3;
            num11 = num4;
            num13 = num5;
            str2 = str3;
            str = str4;
            num9 = num;
        }
        Intent intent3 = intent;
        intent3.putExtra("finishActivityOnSaveCompleted", true);
        intent3.putParcelableArrayListExtra("data", arrayList5);
        try {
            ad0Var.f31774p1.getParentActivity().startActivity(intent3);
            ad0Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
