package org.telegram.ui.Components;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

public final class wd0 implements DialogInterface.OnClickListener {

    public final be0 f34162a;

    public wd0(be0 be0Var) {
        this.f34162a = be0Var;
    }

    public static void a(String str, ContentValues contentValues) {
        if (str.startsWith("X-")) {
            contentValues.put("data2", (Integer) 0);
            contentValues.put("data3", str.substring(2));
            return;
        }
        if ("PREF".equalsIgnoreCase(str)) {
            contentValues.put("data2", (Integer) 12);
            return;
        }
        if ("HOME".equalsIgnoreCase(str)) {
            contentValues.put("data2", (Integer) 1);
            return;
        }
        if ("MOBILE".equalsIgnoreCase(str) || "CELL".equalsIgnoreCase(str)) {
            contentValues.put("data2", (Integer) 2);
            return;
        }
        if ("OTHER".equalsIgnoreCase(str)) {
            contentValues.put("data2", (Integer) 7);
            return;
        }
        if ("WORK".equalsIgnoreCase(str)) {
            contentValues.put("data2", (Integer) 3);
            return;
        }
        if ("RADIO".equalsIgnoreCase(str) || "VOICE".equalsIgnoreCase(str)) {
            contentValues.put("data2", (Integer) 14);
            return;
        }
        if ("PAGER".equalsIgnoreCase(str)) {
            contentValues.put("data2", (Integer) 6);
            return;
        }
        if ("CALLBACK".equalsIgnoreCase(str)) {
            contentValues.put("data2", (Integer) 8);
            return;
        }
        if ("CAR".equalsIgnoreCase(str)) {
            contentValues.put("data2", (Integer) 9);
            return;
        }
        if ("ASSISTANT".equalsIgnoreCase(str)) {
            contentValues.put("data2", (Integer) 19);
            return;
        }
        if ("MMS".equalsIgnoreCase(str)) {
            contentValues.put("data2", (Integer) 20);
        } else if (str.startsWith("FAX")) {
            contentValues.put("data2", (Integer) 4);
        } else {
            contentValues.put("data2", (Integer) 0);
            contentValues.put("data3", str);
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Intent intent;
        String str;
        be0 be0Var;
        String str2;
        Intent intent2;
        ArrayList arrayList;
        ArrayList<? extends Parcelable> arrayList2;
        Integer num;
        Integer num2;
        String str3;
        String str4;
        Integer num3;
        String str5;
        Integer num4;
        Integer num5;
        Integer num6 = 7;
        Integer num7 = 5;
        Integer num8 = 4;
        Integer num9 = 6;
        be0 be0Var2 = this.f34162a;
        ArrayList arrayList3 = be0Var2.I;
        ArrayList arrayList4 = be0Var2.H;
        Integer num10 = 0;
        if (i10 == 0) {
            intent = new Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/raw_contact");
        } else if (i10 == 1) {
            intent = new Intent("android.intent.action.INSERT_OR_EDIT");
            intent.setType("vnd.android.cursor.item/contact");
        } else {
            intent = null;
        }
        TLRPC.TL_userContact_old2 tL_userContact_old2 = be0Var2.J;
        intent.putExtra("name", ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        int i11 = 0;
        while (true) {
            str = "data1";
            be0Var = be0Var2;
            str2 = "mimetype";
            if (i11 >= arrayList3.size()) {
                break;
            }
            AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) arrayList3.get(i11);
            int i12 = i11;
            ContentValues contentValues = new ContentValues();
            contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
            contentValues.put("data1", vcardItem.getValue(false));
            a(vcardItem.getRawType(false), contentValues);
            arrayList5.add(contentValues);
            i11 = i12 + 1;
            be0Var2 = be0Var;
            arrayList3 = arrayList3;
        }
        int i13 = 0;
        boolean z10 = false;
        while (i13 < arrayList4.size()) {
            AndroidUtilities.VcardItem vcardItem2 = (AndroidUtilities.VcardItem) arrayList4.get(i13);
            int i14 = i13;
            int i15 = vcardItem2.type;
            boolean z11 = z10;
            if (i15 == 1) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(str2, "vnd.android.cursor.item/email_v2");
                intent2 = intent;
                contentValues2.put(str, vcardItem2.getValue(false));
                a(vcardItem2.getRawType(false), contentValues2);
                arrayList5.add(contentValues2);
                num = num6;
                num10 = num10;
                num7 = num7;
                num8 = num8;
                num2 = num9;
                str4 = str;
                str3 = str2;
                arrayList = arrayList4;
                arrayList2 = arrayList5;
            } else {
                intent2 = intent;
                arrayList = arrayList4;
                arrayList2 = arrayList5;
                num = num6;
                if (i15 == 3) {
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put(str2, "vnd.android.cursor.item/website");
                    String str6 = str2;
                    contentValues3.put(str, vcardItem2.getValue(false));
                    String rawType = vcardItem2.getRawType(false);
                    if (rawType.startsWith("X-")) {
                        contentValues3.put("data2", num10);
                        contentValues3.put("data3", rawType.substring(2));
                    } else if ("HOMEPAGE".equalsIgnoreCase(rawType)) {
                        contentValues3.put("data2", (Integer) 1);
                    } else if ("BLOG".equalsIgnoreCase(rawType)) {
                        contentValues3.put("data2", (Integer) 2);
                    } else if ("PROFILE".equalsIgnoreCase(rawType)) {
                        contentValues3.put("data2", (Integer) 3);
                    } else if ("HOME".equalsIgnoreCase(rawType)) {
                        contentValues3.put("data2", num8);
                    } else if ("WORK".equalsIgnoreCase(rawType)) {
                        contentValues3.put("data2", num7);
                    } else {
                        if ("FTP".equalsIgnoreCase(rawType)) {
                            contentValues3.put("data2", num9);
                        } else if ("OTHER".equalsIgnoreCase(rawType)) {
                            num5 = num;
                            contentValues3.put("data2", num5);
                        } else {
                            num5 = num;
                            contentValues3.put("data2", num10);
                            contentValues3.put("data3", rawType);
                        }
                        arrayList2.add(contentValues3);
                        num = num5;
                        num10 = num10;
                        num8 = num8;
                        num2 = num9;
                        str4 = str;
                        arrayList = arrayList;
                        str3 = str6;
                        num7 = num7;
                    }
                    num5 = num;
                    arrayList2.add(contentValues3);
                    num = num5;
                    num10 = num10;
                    num8 = num8;
                    num2 = num9;
                    str4 = str;
                    arrayList = arrayList;
                    str3 = str6;
                    num7 = num7;
                } else {
                    String str7 = str2;
                    arrayList2 = arrayList2;
                    if (i15 == 4) {
                        ContentValues contentValues4 = new ContentValues();
                        contentValues4.put(str7, "vnd.android.cursor.item/note");
                        contentValues4.put(str, vcardItem2.getValue(false));
                        arrayList2.add(contentValues4);
                        str3 = str7;
                        num2 = num9;
                    } else {
                        num2 = num9;
                        if (i15 == 5) {
                            ContentValues contentValues5 = new ContentValues();
                            contentValues5.put(str7, "vnd.android.cursor.item/contact_event");
                            contentValues5.put(str, vcardItem2.getValue(false));
                            contentValues5.put("data2", (Integer) 3);
                            arrayList2.add(contentValues5);
                            str3 = str7;
                        } else {
                            num7 = num7;
                            num8 = num8;
                            num10 = num10;
                            if (i15 == 2) {
                                ContentValues contentValues6 = new ContentValues();
                                contentValues6.put(str7, "vnd.android.cursor.item/postal-address_v2");
                                String[] rawValue = vcardItem2.getRawValue();
                                String str8 = str;
                                if (rawValue.length > 0) {
                                    contentValues6.put("data5", rawValue[0]);
                                }
                                if (rawValue.length > 1) {
                                    contentValues6.put("data6", rawValue[1]);
                                }
                                if (rawValue.length > 2) {
                                    contentValues6.put("data4", rawValue[2]);
                                }
                                if (rawValue.length > 3) {
                                    contentValues6.put("data7", rawValue[3]);
                                }
                                if (rawValue.length > 4) {
                                    contentValues6.put("data8", rawValue[4]);
                                }
                                if (rawValue.length > 5) {
                                    contentValues6.put("data9", rawValue[5]);
                                }
                                if (rawValue.length > 6) {
                                    contentValues6.put("data10", rawValue[6]);
                                }
                                String rawType2 = vcardItem2.getRawType(false);
                                if ("HOME".equalsIgnoreCase(rawType2)) {
                                    contentValues6.put("data2", (Integer) 1);
                                } else if ("WORK".equalsIgnoreCase(rawType2)) {
                                    contentValues6.put("data2", (Integer) 2);
                                } else if ("OTHER".equalsIgnoreCase(rawType2)) {
                                    contentValues6.put("data2", (Integer) 3);
                                }
                                arrayList2.add(contentValues6);
                                str3 = str7;
                                str4 = str8;
                            } else {
                                String str9 = str;
                                if (i15 == 20) {
                                    ContentValues contentValues7 = new ContentValues();
                                    contentValues7.put(str7, "vnd.android.cursor.item/im");
                                    String rawType3 = vcardItem2.getRawType(true);
                                    String rawType4 = vcardItem2.getRawType(false);
                                    str3 = str7;
                                    contentValues7.put(str9, vcardItem2.getValue(false));
                                    if ("AIM".equalsIgnoreCase(rawType3)) {
                                        num4 = num10;
                                        contentValues7.put("data5", num4);
                                        str5 = str9;
                                    } else {
                                        num4 = num10;
                                        if ("MSN".equalsIgnoreCase(rawType3)) {
                                            str5 = str9;
                                            contentValues7.put("data5", (Integer) 1);
                                        } else if ("YAHOO".equalsIgnoreCase(rawType3)) {
                                            str5 = str9;
                                            contentValues7.put("data5", (Integer) 2);
                                        } else if ("SKYPE".equalsIgnoreCase(rawType3)) {
                                            str5 = str9;
                                            contentValues7.put("data5", (Integer) 3);
                                        } else if ("QQ".equalsIgnoreCase(rawType3)) {
                                            str5 = str9;
                                            contentValues7.put("data5", num8);
                                        } else if ("GOOGLE-TALK".equalsIgnoreCase(rawType3)) {
                                            str5 = str9;
                                            contentValues7.put("data5", num7);
                                        } else if ("ICQ".equalsIgnoreCase(rawType3)) {
                                            str5 = str9;
                                            contentValues7.put("data5", num2);
                                        } else if ("JABBER".equalsIgnoreCase(rawType3)) {
                                            str5 = str9;
                                            contentValues7.put("data5", num);
                                        } else if ("NETMEETING".equalsIgnoreCase(rawType3)) {
                                            str5 = str9;
                                            contentValues7.put("data5", (Integer) 8);
                                        } else {
                                            str5 = str9;
                                            contentValues7.put("data5", (Integer) (-1));
                                            contentValues7.put("data6", vcardItem2.getRawType(true));
                                        }
                                    }
                                    if ("HOME".equalsIgnoreCase(rawType4)) {
                                        contentValues7.put("data2", (Integer) 1);
                                    } else if ("WORK".equalsIgnoreCase(rawType4)) {
                                        contentValues7.put("data2", (Integer) 2);
                                    } else if ("OTHER".equalsIgnoreCase(rawType4)) {
                                        contentValues7.put("data2", (Integer) 3);
                                    }
                                    arrayList2.add(contentValues7);
                                    num10 = num4;
                                    str4 = str5;
                                } else {
                                    str3 = str7;
                                    Integer num11 = num10;
                                    str4 = str9;
                                    if (i15 != 6 || z11) {
                                        num10 = num11;
                                    } else {
                                        ContentValues contentValues8 = new ContentValues();
                                        String str10 = str3;
                                        contentValues8.put(str10, "vnd.android.cursor.item/organization");
                                        int i16 = i14;
                                        while (i16 < arrayList.size()) {
                                            ArrayList arrayList6 = arrayList;
                                            AndroidUtilities.VcardItem vcardItem3 = (AndroidUtilities.VcardItem) arrayList6.get(i16);
                                            int i17 = i16;
                                            String str11 = str10;
                                            if (vcardItem3.type != 6) {
                                                num3 = num11;
                                            } else {
                                                String rawType5 = vcardItem3.getRawType(true);
                                                if ("ORG".equalsIgnoreCase(rawType5)) {
                                                    String[] rawValue2 = vcardItem3.getRawValue();
                                                    if (rawValue2.length == 0) {
                                                        num3 = num11;
                                                    } else {
                                                        num3 = num11;
                                                        if (rawValue2.length >= 1) {
                                                            contentValues8.put(str4, rawValue2[0]);
                                                        }
                                                        if (rawValue2.length >= 2) {
                                                            contentValues8.put("data5", rawValue2[1]);
                                                        }
                                                    }
                                                } else {
                                                    num3 = num11;
                                                    if ("TITLE".equalsIgnoreCase(rawType5) || "ROLE".equalsIgnoreCase(rawType5)) {
                                                        contentValues8.put("data4", vcardItem3.getValue(false));
                                                    }
                                                }
                                                String rawType6 = vcardItem3.getRawType(true);
                                                if ("WORK".equalsIgnoreCase(rawType6)) {
                                                    contentValues8.put("data2", (Integer) 1);
                                                } else if ("OTHER".equalsIgnoreCase(rawType6)) {
                                                    contentValues8.put("data2", (Integer) 2);
                                                }
                                            }
                                            i16 = i17 + 1;
                                            arrayList = arrayList6;
                                            num11 = num3;
                                            str10 = str11;
                                        }
                                        str3 = str10;
                                        num10 = num11;
                                        arrayList = arrayList;
                                        arrayList2.add(contentValues8);
                                        z10 = true;
                                    }
                                }
                            }
                        }
                        i13 = i14 + 1;
                        arrayList4 = arrayList;
                        arrayList5 = arrayList2;
                        intent = intent2;
                        num9 = num2;
                        num7 = num7;
                        num8 = num8;
                        num10 = num10;
                        str2 = str3;
                        str = str4;
                        num6 = num;
                    }
                    str4 = str;
                }
            }
            z10 = z11;
            i13 = i14 + 1;
            arrayList4 = arrayList;
            arrayList5 = arrayList2;
            intent = intent2;
            num9 = num2;
            num7 = num7;
            num8 = num8;
            num10 = num10;
            str2 = str3;
            str = str4;
            num6 = num;
        }
        Intent intent3 = intent;
        intent3.putExtra("finishActivityOnSaveCompleted", true);
        intent3.putParcelableArrayListExtra("data", arrayList5);
        try {
            be0Var.f27079r.getParentActivity().startActivity(intent3);
            be0Var.dismiss();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
